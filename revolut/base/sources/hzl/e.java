package hzl;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements yqi.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yqi.f[] f157256a;

    public static final class a implements yqi.a {
        private a() {
        }
    }

    public e() {
        this(0);
    }

    public final m b(String pinCode, String phone) {
        Intrinsics.checkNotNullParameter(pinCode, "pinCode");
        Intrinsics.checkNotNullParameter(phone, "phone");
        yqi.f[] fVarArr = this.f157256a;
        yqi.d dVarA = super.a((yqi.f[]) Arrays.copyOf(fVarArr, fVarArr.length), new d(pinCode, phone));
        Intrinsics.checkNotNullParameter(dVarA, "<this>");
        List list = dVarA.f316033b;
        if (list.isEmpty()) {
            return l.f157267a;
        }
        Object objB0 = d0.b0(list);
        Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.utils.PinCodeValidator.PinCodeValidationError");
        j jVar = (j) objB0;
        return new k(jVar.getTitle(), jVar.getDescription());
    }

    public e(yqi.f[] validators) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f157256a = validators;
    }

    public e(int i) {
        this((yqi.f[]) b.f157252a.getValue());
    }
}
