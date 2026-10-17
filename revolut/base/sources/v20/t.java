package v20;

import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class t implements kfm.o, kfm.g, ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285567b;

    public /* synthetic */ t(Object obj2, int i) {
        this.f285566a = i;
        this.f285567b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f285566a) {
            case 3:
                ((p) this.f285567b).invoke(obj2);
                break;
            case 8:
                ((w) this.f285567b).invoke(obj2);
                break;
            case 9:
                ((p) this.f285567b).invoke(obj2);
                break;
            case 10:
                ((w) this.f285567b).invoke(obj2);
                break;
            case 11:
                ((p) this.f285567b).invoke(obj2);
                break;
            case 12:
                ((p) this.f285567b).invoke(obj2);
                break;
            case 21:
                ((v3a.d) this.f285567b).invoke(obj2);
                break;
            case 25:
                ((v3a.d) this.f285567b).invoke(obj2);
                break;
            default:
                ((v2g.i) this.f285567b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f285566a) {
            case 0:
                r rVar = (r) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) rVar.invoke(p0);
            case 1:
                r rVar2 = (r) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) rVar2.invoke(p0);
            case 2:
                uyh.k0 k0Var = (uyh.k0) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) k0Var.invoke(p0);
            case 3:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 20:
            case 21:
            case 25:
            default:
                BaseStoriesModel baseStoriesModel = (BaseStoriesModel) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "it");
                return baseStoriesModel;
            case 4:
                s sVar = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) sVar.invoke(p0);
            case 5:
                r rVar3 = (r) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) rVar3.invoke(p0);
            case 6:
                p pVar = (p) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) pVar.invoke(p0);
            case 7:
                s sVar2 = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) sVar2.invoke(p0);
            case 13:
                p pVar2 = (p) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) pVar2.invoke(p0);
            case 14:
                s sVar3 = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) sVar3.invoke(p0);
            case 15:
                s sVar4 = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) sVar4.invoke(p0);
            case 16:
                s sVar5 = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) sVar5.invoke(p0);
            case 17:
                s sVar6 = (s) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) sVar6.invoke(p0);
            case 18:
                return (NaviCommand) ((ux7.i) this.f285567b).invoke(p0);
            case 19:
                return (q35.m) ((s) this.f285567b).invoke(p0);
            case 22:
                v2g.i iVar = (v2g.i) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar.invoke(p0);
                return Boolean.TRUE;
            case 23:
                uyh.w wVar = (uyh.w) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) wVar.invoke(p0);
            case 24:
                v2g.i iVar2 = (v2g.i) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) iVar2.invoke(p0);
            case 26:
                v2g.i iVar3 = (v2g.i) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar3.invoke(p0);
                return Boolean.TRUE;
            case 27:
                uyh.k0 k0Var2 = (uyh.k0) this.f285567b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) k0Var2.invoke(p0);
        }
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        v2m.b this$0 = (v2m.b) this.f285567b;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (zBooleanValue) {
            Function0 function0 = this$0.f285754b;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Fragment fragment = this$0.f285753a;
        if (fragment != null ? fragment.shouldShowRequestPermissionRationale("android.permission.CAMERA") : false) {
            Function0 function02 = this$0.f285755c;
            if (function02 != null) {
                function02.invoke();
                return;
            }
            return;
        }
        Function0 function03 = this$0.d;
        if (function03 != null) {
            function03.invoke();
        }
    }
}
