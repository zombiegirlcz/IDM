package ztc;

import com.revolut.feature.security_hub.api.models.DigitizedCard;
import h93.f0;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c extends q implements Function2 {
    public static final c f = new c();

    public c() {
        super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        f0 p0 = (f0) obj2;
        DigitizedCard p17 = (DigitizedCard) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return new Pair(p0, p17);
    }
}
