package npi;

import a08.f0;
import android.content.Context;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import ihm.j;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nmb.v;
import no.e0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import syl.h;
import syl.m;
import t70.g;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends fsi.c implements f, a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f218220n = new fsi.b("DIALOG_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f218221h;
    public final BaseDelegatesActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f218222j;
    public tyl.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rp0.d f218223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f218224m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context activityContext, BaseDelegatesActivity activity, g localization) {
        super(f218220n);
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f218221h = activityContext;
        this.i = activity;
        this.f218222j = localization;
        this.f218223l = new rp0.d(activityContext);
        this.f218224m = p.a.h("toSerialized(...)");
    }

    public static void O(c cVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, Function1 function1, Function0 function0, int i) {
        Function1 function12 = (i & 32) != 0 ? null : function1;
        tyl.d dVar = new tyl.d(cVar.f218221h, u.c(new h(charSequence3, charSequence4)), null, null, charSequence, charSequence2, z, new ni1.a(cVar, (i & 64) == 0 ? function0 : null, 21), LDSFile.EF_DG12_TAG);
        dVar.d(new f0(27, function12));
        tyl.d dVar2 = cVar.k;
        if (dVar2 != null) {
            dVar2.c();
        }
        if (cVar.i.isFinishing()) {
            return;
        }
        cVar.k = dVar.e();
    }

    public final void N(CharSequence charSequence, CharSequence charSequence2, CharSequence positive, CharSequence charSequence3, boolean z, boolean z3, Function1 confirmationListener) {
        Intrinsics.checkNotNullParameter(positive, "positive");
        Intrinsics.checkNotNullParameter(confirmationListener, "confirmationListener");
        if (!z) {
            O(this, charSequence, charSequence2, positive, charSequence3, z3, confirmationListener, null, 64);
            return;
        }
        ArrayList items = new ArrayList();
        items.add(new m("positive", positive));
        if (charSequence3 != null && !d0.W(charSequence3)) {
            items.add(new m("negative", charSequence3));
        }
        js7.c itemClickListener = new js7.c(10, confirmationListener);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        tyl.d dVar = new tyl.d(this.f218221h, items, itemClickListener, new v(23), charSequence, charSequence2, z3, null, 96);
        tyl.d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.c();
        }
        if (this.i.isFinishing()) {
            return;
        }
        this.k = dVar.e();
    }

    public final void Q(d dialogConfiguration) {
        Intrinsics.checkNotNullParameter(dialogConfiguration, "dialogConfiguration");
        if (!(dialogConfiguration instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        N(dialogConfiguration.e(), dialogConfiguration.d(), dialogConfiguration.c(), dialogConfiguration.b(), false, dialogConfiguration.a(), new e0(this, dialogConfiguration, 7));
    }

    public final void R(rp0.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f218223l.b(configuration);
    }

    public final void V(CharSequence charSequence, String str, CharSequence charSequence2, Function0 onDismiss) {
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        if (charSequence2 == null || charSequence2.length() == 0) {
            charSequence2 = this.f218222j.getString(R$string.common_ok);
        }
        O(this, charSequence, str, charSequence2, null, true, null, onDismiss, 32);
    }
}
