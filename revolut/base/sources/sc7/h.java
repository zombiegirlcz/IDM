package sc7;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f261654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f261655c;

    public /* synthetic */ h(j jVar, boolean z, int i) {
        this.f261653a = i;
        this.f261654b = jVar;
        this.f261655c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand command = (NaviCommand) obj2;
        switch (this.f261653a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                break;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                break;
        }
        return this.f261654b.e(command, this.f261655c);
    }
}
