package coj;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f25559b;

    public /* synthetic */ c(g gVar, int i) {
        this.f25558a = i;
        this.f25559b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FeatureCommand command = (FeatureCommand) obj2;
        switch (this.f25558a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                break;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                break;
        }
        return this.f25559b.f25567c.a(command);
    }
}
