package m6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestAttributes;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.moneyrequest.MoneyRequestSettings;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.domain.models.tracking.MoneyRequestAppSource;
import dj0.d;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import xi0.b;
import z8l.g;
import z8l.i;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f203220a = r0.k(new Pair("DEFAULT", MoneyRequestAppSource.DEFAULT), new Pair("SPLIT_BILL", MoneyRequestAppSource.SPLIT_BILL));

    public static final MoneyRequest a(i iVar, DateTime dateTime, MoneyRequestDirection direction) {
        DateTime dateTime2;
        MoneyRequestSettings moneyRequestSettings;
        MoneyRequestAttributes moneyRequestAttributes;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        String id10 = iVar.getId();
        MoneyRequestState.Companion companion = MoneyRequestState.INSTANCE;
        String state = iVar.getState();
        if (state == null) {
            state = "";
        }
        companion.getClass();
        MoneyRequestState moneyRequestStateA = MoneyRequestState.Companion.a(state);
        MoneyRequestChannel.Companion companion2 = MoneyRequestChannel.INSTANCE;
        String channel = iVar.getChannel();
        companion2.getClass();
        MoneyRequestChannel moneyRequestChannelA = MoneyRequestChannel.Companion.a(channel);
        long amount = iVar.getAmount();
        xi0.a aVar = b.Companion;
        String currency = iVar.getCurrency();
        aVar.getClass();
        d dVar = new d(amount, xi0.a.a(currency));
        String comment = iVar.getComment();
        String gifUrl = iVar.getGifUrl();
        String receiveUrl = iVar.getReceiveUrl();
        Long expiryDate = iVar.getExpiryDate();
        DateTime dateTime3 = expiryDate != null ? new DateTime(expiryDate.longValue()) : null;
        DateTime dateTime4 = new DateTime(iVar.getUpdatedDate());
        g payer = iVar.getPayer();
        MoneyRequestCounterParty moneyRequestCounterPartyB = payer != null ? b(payer) : null;
        MoneyRequestCounterParty moneyRequestCounterPartyB2 = b(iVar.getCreator());
        g requester = iVar.getRequester();
        MoneyRequestCounterParty moneyRequestCounterPartyB3 = requester != null ? b(requester) : null;
        String splitBillId = iVar.getSplitBillId();
        String registeredIdentityId = iVar.getRegisteredIdentityId();
        List modifiableFields = iVar.getModifiableFields();
        if (modifiableFields != null) {
            dateTime2 = dateTime3;
            moneyRequestSettings = new MoneyRequestSettings(modifiableFields.contains("amount"), modifiableFields.contains("reference"));
        } else {
            dateTime2 = dateTime3;
            moneyRequestSettings = null;
        }
        z8l.b attributes = iVar.getAttributes();
        if (attributes != null) {
            Intrinsics.checkNotNullParameter(attributes, "<this>");
            moneyRequestAttributes = new MoneyRequestAttributes(attributes.getInvoiceUrl(), attributes.getInvoiceNumber());
        } else {
            moneyRequestAttributes = null;
        }
        return new MoneyRequest(id10, moneyRequestStateA, moneyRequestChannelA, dVar, comment, gifUrl, receiveUrl, dateTime2, dateTime, dateTime4, moneyRequestCounterPartyB, moneyRequestCounterPartyB2, moneyRequestCounterPartyB3, direction, splitBillId, registeredIdentityId, moneyRequestSettings, moneyRequestAttributes);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty b(z8l.g r18) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6k.a.b(z8l.g):com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final String c(MoneyRequestAppSource moneyRequestAppSource) {
        Intrinsics.checkNotNullParameter(moneyRequestAppSource, "<this>");
        return u1.g(moneyRequestAppSource, f203220a);
    }
}
