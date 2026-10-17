package mic;

import com.google.android.gms.tasks.OnFailureListener;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.data.model.Data;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a0 implements kfm.o, kfm.g, OnFailureListener, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f205652b;

    public /* synthetic */ a0(int i, Function1 function1) {
        this.f205651a = i;
        this.f205652b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f205651a;
        Function1 function1 = this.f205652b;
        switch (i) {
            case 1:
                BluePromptActivity.a aVar = BluePromptActivity.Companion;
                function1.invoke(obj2);
                break;
            case 8:
                function1.invoke(obj2);
                break;
            case 9:
                function1.invoke(obj2);
                break;
            case 13:
                function1.invoke(obj2);
                break;
            case 14:
                NavBarLargeCentred.Companion companion = NavBarLargeCentred.INSTANCE;
                function1.invoke(obj2);
                break;
            default:
                function1.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f205651a) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
            case 3:
            case 8:
            case 9:
            case 13:
            case 14:
            case 22:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return (Data) this.f205652b.invoke(p0);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f205652b.invoke(it8);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) this.f205652b.invoke(p0)).booleanValue();
    }
}
