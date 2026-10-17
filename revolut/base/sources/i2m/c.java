package i2m;

import ch.qos.logback.core.CoreConstants;
import com.trustdockekyc.core.backend.domain.model.AppError;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import k1m.b0;
import k1m.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import u1m.f0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f158057a = {"6c1eda7c58973d62b81fd3ea49086a71456af59e096bb5afb6a4a82574cfbd16", "b748f3bd1ff2f5af259a22b9a7acc58eff65d6255d7dbaa4877c36f0527c3cab", "88f72210f153a134b6a7f955ad972f13bfa913f91cc086bdc4c81c94aa135214"};

    public static String a(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            str = "https://native-app-sdk-api.trustdock-ekyc.com/";
        }
        String strConcat = !a0.y(str, "/", false) ? str.concat("/") : str;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = strConcat.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        String strA0 = kotlin.collections.d.a0(bArrDigest, "", null, null, b.f158056h, 30);
        if (kotlin.collections.d.I(f158057a, strA0)) {
            return strConcat;
        }
        String message = "invalid api base url: " + str + " (" + strA0 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        Intrinsics.checkNotNullParameter(message, "message");
        f0 f0Var = f0.VERBOSE;
        throw new AppError.InvalidBaseUrlError(new w1m.c(30, p.a.l(CoreConstants.RIGHT_PARENTHESIS_CHAR, "Invalid Parameter(", str), null, null));
    }

    public static void b(Retrofit.Builder builder) {
        b0 b0Var = new b0();
        b0Var.a(LocalDate.class, new h(0));
        b0Var.a(LocalDateTime.class, new h(1));
        e0 e0VarB = b0Var.b();
        Intrinsics.checkNotNullExpressionValue(e0VarB, "build(...)");
        MoshiConverterFactory moshiConverterFactoryCreate = MoshiConverterFactory.create(e0VarB);
        Intrinsics.checkNotNullExpressionValue(moshiConverterFactoryCreate, "create(...)");
        builder.addConverterFactory(moshiConverterFactoryCreate).addCallAdapterFactory(new g());
    }
}
