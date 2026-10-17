package hee;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b f151701b;

    public /* synthetic */ q(com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar, int i) {
        this.f151700a = i;
        this.f151701b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f151700a) {
            case 0:
                Function1 it8 = (Function1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = this.f151701b;
                bVar.H2(bVar.v, it8);
                return Unit.f186387a;
            default:
                uce.a descriptor = (uce.a) obj2;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return this.f151701b.e1(descriptor);
        }
    }
}
