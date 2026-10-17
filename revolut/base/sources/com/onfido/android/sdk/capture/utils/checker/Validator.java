package com.onfido.android.sdk.capture.utils.checker;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\u0002H\u00052\u0006\u0010\u0007\u001a\u0002H\u0006H\u0086\u0004¢\u0006\u0002\u0010\bJ_\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\u0002H\n2>\u0010\u000b\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00040\f\"\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/checker/Validator;", "", "()V", "orThrow", "Lkotlin/Pair;", "A", "B", "that", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "validate", "T", "validations", "", "Lkotlin/Function0;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwOnWrongAssertion", "(Ljava/lang/Object;[Lkotlin/Pair;Z)Ljava/lang/Object;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Validator {

    @NotNull
    public static final Validator INSTANCE = new Validator();

    private Validator() {
    }

    public static /* synthetic */ Object validate$default(Validator validator, Object obj2, Pair[] pairArr, boolean z, int i, Object obj3) {
        if ((i & 2) != 0) {
            z = true;
        }
        return validator.validate(obj2, pairArr, z);
    }

    @NotNull
    public final <A, B> Pair<A, B> orThrow(A a7, B b4) {
        return new Pair<>(a7, b4);
    }

    public final <T> T validate(T t2, @NotNull Pair<? extends Function0<Boolean>, ? extends Exception>[] validations, boolean z) throws Throwable {
        Intrinsics.checkNotNullParameter(validations, "validations");
        for (Pair<? extends Function0<Boolean>, ? extends Exception> pair : validations) {
            Object obj2 = pair.f186385a;
            Object obj3 = pair.f186386b;
            boolean zBooleanValue = ((Boolean) ((Function0) obj2).invoke()).booleanValue();
            if (z && !zBooleanValue) {
                throw ((Throwable) obj3);
            }
            if (!z && zBooleanValue) {
                throw ((Throwable) obj3);
            }
        }
        return t2;
    }
}
