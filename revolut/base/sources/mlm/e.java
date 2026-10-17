package mlm;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qlm.n1;
import qlm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f207093b;

    public /* synthetic */ e(f fVar, int i) {
        this.f207092a = i;
        this.f207093b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        olm.a buildSerialDescriptor = (olm.a) obj2;
        switch (this.f207092a) {
            case 0:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                nlm.a.d(t0.f186434a);
                n1 n1Var = v1.f247719b;
                f0 f0Var = f0.f322471a;
                buildSerialDescriptor.a("type", n1Var, f0Var, false);
                StringBuilder sb6 = new StringBuilder("kotlinx.serialization.Sealed<");
                f fVar = this.f207093b;
                sb6.append(fVar.f207094a.m());
                sb6.append('>');
                e eVar = new e(fVar, 1);
                buildSerialDescriptor.a("value", com.bumptech.glide.c.e(sb6.toString(), olm.i.f226485b, new SerialDescriptor[0], eVar), f0Var, false);
                buildSerialDescriptor.c(fVar.f207095b);
                break;
            default:
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                for (Map.Entry entry : this.f207093b.e.entrySet()) {
                    buildSerialDescriptor.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), f0.f322471a, false);
                }
                break;
        }
        return Unit.f186387a;
    }
}
