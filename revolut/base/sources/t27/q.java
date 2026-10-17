package t27;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f267441a = new q();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Data data2 = (Data) obj3;
        return Boolean.valueOf(Intrinsics.f(org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "old", "new"), data2.getContent()) && Intrinsics.f(data.getError(), data2.getError()));
    }
}
