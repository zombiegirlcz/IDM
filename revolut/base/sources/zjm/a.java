package zjm;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f322878a = new a();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        KotlinType it8 = (KotlinType) obj2;
        IntegerLiteralTypeConstructor.Companion companion = IntegerLiteralTypeConstructor.Companion;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.toString();
    }
}
