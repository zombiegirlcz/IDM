package ie9;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Type f160678c;
    public static final Type d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f160679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f160680b;

    static {
        Type type = new TypeToken<Integer>() { // from class: com.revolut.feature.passcode.lock.PasscodeLockRepositoryImpl$Companion$INT_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f160678c = type;
        Type type2 = new TypeToken<Long>() { // from class: com.revolut.feature.passcode.lock.PasscodeLockRepositoryImpl$Companion$LONG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        d = type2;
    }

    public h(ue0.c storage, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f160679a = storage;
        this.f160680b = dateProvider;
    }

    public final Object a() {
        return this.f160679a.v0(new Integer(0), "KEY_INCORRECT_ATTEMPT_COUNT", f160678c);
    }

    public final Object b(gim.c cVar) {
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, new f(this, null), cVar);
    }
}
