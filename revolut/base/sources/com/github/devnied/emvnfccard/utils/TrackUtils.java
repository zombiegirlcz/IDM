package com.github.devnied.emvnfccard.utils;

import bnm.b;
import com.github.devnied.emvnfccard.model.EmvTrack1;
import com.github.devnied.emvnfccard.model.EmvTrack2;
import com.github.devnied.emvnfccard.model.Service;
import fr.devnied.bitlib.BytesUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ymm.g;

/* JADX INFO: loaded from: classes16.dex */
public final class TrackUtils {
    public static final String CARD_HOLDER_NAME_SEPARATOR = "/";
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) TrackUtils.class);
    private static final Pattern TRACK2_EQUIVALENT_PATTERN = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");
    private static final Pattern TRACK1_PATTERN = Pattern.compile("%?([A-Z])([0-9]{1,19})(\\?[0-9])?\\^([^\\^]{2,26})\\^([0-9]{4}|\\^)([0-9]{3}|\\^)([^\\?]+)\\??");

    private TrackUtils() {
    }

    public static EmvTrack1 extractTrack1Data(byte[] bArr) {
        if (bArr != null) {
            EmvTrack1 emvTrack1 = new EmvTrack1();
            emvTrack1.setRaw(bArr);
            Matcher matcher = TRACK1_PATTERN.matcher(new String(bArr));
            if (matcher.find()) {
                emvTrack1.setFormatCode(matcher.group(1));
                emvTrack1.setCardNumber(matcher.group(2));
                String[] strArrI = g.i(matcher.group(4).trim());
                if (strArrI != null && strArrI.length == 2) {
                    emvTrack1.setHolderLastname(g.j(strArrI[0]));
                    emvTrack1.setHolderFirstname(g.j(strArrI[1]));
                }
                try {
                    emvTrack1.setExpireDate(b.a(new SimpleDateFormat("yyMM", Locale.getDefault()).parse(matcher.group(5))));
                    emvTrack1.setService(new Service(matcher.group(6)));
                    return emvTrack1;
                } catch (ParseException e) {
                    LOGGER.error("Unparsable expire card date : {}", e.getMessage());
                }
            }
        }
        return null;
    }

    public static EmvTrack2 extractTrack2EquivalentData(byte[] bArr) {
        if (bArr != null) {
            EmvTrack2 emvTrack2 = new EmvTrack2();
            emvTrack2.setRaw(bArr);
            Matcher matcher = TRACK2_EQUIVALENT_PATTERN.matcher(BytesUtils.bytesToStringNoSpace(bArr));
            if (matcher.find()) {
                emvTrack2.setCardNumber(matcher.group(1));
                try {
                    emvTrack2.setExpireDate(b.a(new SimpleDateFormat("yyMM", Locale.getDefault()).parse(matcher.group(2))));
                    emvTrack2.setService(new Service(matcher.group(3)));
                    return emvTrack2;
                } catch (ParseException e) {
                    LOGGER.error("Unparsable expire card date : {}", e.getMessage());
                }
            }
        }
        return null;
    }
}
