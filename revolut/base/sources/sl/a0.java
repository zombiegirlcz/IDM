package sl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.ui.countryselection.OnfidoSupportedDocumentsRepository;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.utils.JsonExtKt;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.token.sdk.ApplicantId;
import java.util.Iterator;
import java.util.Map;
import jl.t0;
import jl.w0;
import jl.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoSupportedDocumentsRepository f264024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnfidoRemoteConfig f264025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Json f264026c;
    public final k7i.i d;

    public a0(OnfidoSupportedDocumentsRepository supportedDocumentsRepository, OnfidoRemoteConfig onfidoRemoteConfig, Json jsonParser, k7i.i localeProvider) {
        Intrinsics.checkNotNullParameter(supportedDocumentsRepository, "supportedDocumentsRepository");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        this.f264024a = supportedDocumentsRepository;
        this.f264025b = onfidoRemoteConfig;
        this.f264026c = jsonParser;
        this.d = localeProvider;
    }

    public static DocumentType c(DocType docType) {
        switch (z.f264076c[docType.ordinal()]) {
            case 1:
                return DocumentType.PASSPORT;
            case 2:
                return DocumentType.DRIVING_LICENCE;
            case 3:
                return DocumentType.NATIONAL_IDENTITY_CARD;
            case 4:
                return DocumentType.VISA;
            case 5:
                return DocumentType.WORK_PERMIT;
            case 6:
                return DocumentType.RESIDENCE_PERMIT;
            case 7:
                return DocumentType.PASSPORT_CARD;
            case 8:
                return DocumentType.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ml.b a(JsonObject jsonObject, JsonObject jsonObject2, String str, String str2, String str3) {
        JsonElement jsonElementConvertSnakeToCamelCase = JsonExtKt.convertSnakeToCamelCase(jsonObject);
        Json json = this.f264026c;
        String strC = json.c(jh.d.v(json.f187949b, o0.a(JsonElement.class)), jsonElementConvertSnakeToCamelCase);
        Map mapG = jsonObject2;
        if (jsonObject2 == null) {
            mapG = r0.g();
        }
        return new ml.b(new m(str, str2, strC, json.c(jh.d.v(json.f187949b, o0.a(JsonElement.class)), JsonExtKt.convertSnakeToCamelCase(new JsonObject(r0.q(mapG, new Pair("workflow_run_id", rlm.j.c(str3))))))));
    }

    public final ml.b b(JsonObject jsonObject, String str, String str2, ApplicantId applicantId, JsonObject jsonObject2) {
        Object objA;
        Object next;
        Json json = this.f264026c;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = (t0) json.a(jh.d.v(json.f187949b, o0.b(t0.class)), jsonObject);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (!(objA instanceof yhm.n)) {
            try {
                t0 t0Var = (t0) objA;
                boolean z = t0Var.f175570a;
                boolean z3 = t0Var.f175571b;
                String str3 = null;
                if (jsonObject2 != null) {
                    Iterator it8 = ((w0) json.a(jh.d.v(json.f187949b, o0.b(w0.class)), jsonObject2)).f175576a.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (Intrinsics.f(((z0) next).f175581a, "encrypted_biometric_token")) {
                            break;
                        }
                    }
                    z0 z0Var = (z0) next;
                    if (z0Var != null) {
                        str3 = z0Var.f175582b;
                    }
                }
                objA = new ml.b(new o(str, str2, new MotionCaptureVariantOptions(z, z3, false, str3, 4, null), applicantId));
            } catch (Throwable th11) {
                m.Companion companion3 = yhm.m.INSTANCE;
                objA = yhm.o.a(th11);
            }
        }
        if (yhm.m.a(objA) != null) {
            objA = new ml.b(new o(str, str2, MotionCaptureVariantOptions.INSTANCE.getDEFAULT(), applicantId));
        }
        return (ml.b) objA;
    }
}
