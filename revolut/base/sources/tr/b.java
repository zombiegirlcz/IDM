package tr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.revolut.biometric_verification.impl.domain.models.active_liveness.ActiveLivenessCode;
import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import gv.k;
import gv.l;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nq.l0;
import nq.v;
import nq.w;
import od0.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f273622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iy.b f273623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f273624c;

    public b(d maskNormalizer, qd0.b languageProvider, c byteArrayDecoder, iy.b experimentsInteractor, i nfcAdapterOptional) {
        Intrinsics.checkNotNullParameter(maskNormalizer, "maskNormalizer");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(byteArrayDecoder, "byteArrayDecoder");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(nfcAdapterOptional, "nfcAdapterOptional");
        this.f273622a = languageProvider;
        this.f273623b = experimentsInteractor;
        this.f273624c = nfcAdapterOptional;
    }

    public final v a(w scanType, k photoMedia, rz.a aVar, ResultInternal resultInternal, Iterable validationResults) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(photoMedia, "photoMedia");
        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
        byte[] byteArray = photoMedia.f147016a.array();
        Intrinsics.h(byteArray);
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
        List listA = null;
        if (aVar != null) {
            try {
                listA = d.a(aVar, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        return new v(scanType, listA, photoMedia.f147017b / 100, Math.max(bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()), c(), resultInternal, this.f273624c.d(), null, null, validationResults);
    }

    public final l0 b(w scanType, l videoMedia, rz.a aVar, ResultInternal resultInternal, ActiveLivenessCode activeLivenessCode, boolean z, Locale locale) {
        List listA;
        List list;
        Integer numValueOf;
        String language;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(videoMedia, "videoMedia");
        String str = videoMedia.f147023h;
        if (aVar != null) {
            try {
                listA = d.a(aVar, videoMedia.f147020b, videoMedia.f147021c);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                listA = null;
            }
            list = listA;
        } else {
            list = null;
        }
        long j2 = videoMedia.f;
        String str2 = videoMedia.d;
        VideoEncodingBitRate videoEncodingBitRate = videoMedia.e;
        if (videoEncodingBitRate instanceof VideoEncodingBitRate.Custom) {
            numValueOf = Integer.valueOf(((VideoEncodingBitRate.Custom) videoEncodingBitRate).f50740a);
        } else {
            if (!(videoEncodingBitRate instanceof VideoEncodingBitRate.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        int i = videoMedia.f147021c;
        Locale localeB = locale == null ? ((s80.b) this.f273622a).b() : locale;
        String country = localeB.getCountry();
        if (country == null || country.length() == 0) {
            language = localeB.getLanguage();
            Intrinsics.h(language);
        } else {
            language = com.google.android.gms.internal.mlkit_vision_face.a.o(localeB.getLanguage(), "-", localeB.getCountry());
        }
        return new l0(scanType, language, str, list, j2, str2, numValueOf, i, activeLivenessCode != null ? activeLivenessCode.f50468b : null, z, c(), resultInternal, videoMedia.f147022g, null, null);
    }

    public final String c() {
        iy.a aVar = px.a.e;
        iy.b bVar = this.f273623b;
        String[] elements = {bVar.a(aVar) ? "documentClassificationPrompting" : null, bVar.a(px.a.i) ? "nfcOnTouchActivation" : null, bVar.a(px.a.f240493g) ? "zebraUi" : null, "zebraUiDocuments"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), ",", null, null, 0, null, 62);
    }
}
