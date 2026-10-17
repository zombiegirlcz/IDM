package n2m;

import android.content.DialogInterface;
import com.meshconnect.link.ui.LinkActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211600a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f211601b;

    public /* synthetic */ f(LinkActivity linkActivity) {
        this.f211601b = linkActivity;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.jvm.functions.Function0, kotlin.jvm.internal.u] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f211600a;
        Object obj2 = this.f211601b;
        switch (i2) {
            case 0:
                ?? okAction = (u) obj2;
                Intrinsics.checkNotNullParameter(okAction, "$okAction");
                okAction.invoke();
                break;
            default:
                int i3 = LinkActivity.f49860d0;
                ((LinkActivity) obj2).finish();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(Function0 function0) {
        this.f211601b = (u) function0;
    }
}
