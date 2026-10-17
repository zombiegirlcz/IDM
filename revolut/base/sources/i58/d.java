package i58;

import com.revolut.feature.joint.impl.ui.relationship.JointAccountRelationshipScreen;
import e48.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158786a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JointAccountRelationshipScreen f158787b;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f158786a;
        JointAccountRelationshipScreen jointAccountRelationshipScreen = this.f158787b;
        switch (i) {
            case 0:
                JointAccountRelationshipScreen.a aVar = JointAccountRelationshipScreen.Companion;
                qji.b bVarQ2 = jointAccountRelationshipScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.relationship.di.JointAccountRelationshipScreenInjector");
                m mVar = (m) bVarQ2;
                return new e48.f(mVar.f122456b, mVar.f122457c);
            default:
                JointAccountRelationshipScreen.a aVar2 = JointAccountRelationshipScreen.Companion;
                return (h) ((e48.f) jointAccountRelationshipScreen.Y.getValue()).f122423b.get();
        }
    }
}
