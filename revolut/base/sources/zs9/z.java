package zs9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends jki.g implements r {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GroupCustomizationScreenContract$InputData f324848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f324849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vr9.a f324850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l2j.a f324851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f324852t;
    public final e60.a u;
    public final f01.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wr9.e f324853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n8b.a f324854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f324855y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(GroupCustomizationScreenContract$InputData inputData, e interactor, vr9.a groupCreationCommonMapper, l2j.a currencyChooserFlowFactory, j60.a bottomDialogExtension, e60.a mediaPickerControllerExtension, f01.a uiKitResources, wr9.e memberDialogMapper, jki.p stateMapper, n8b.a countryInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(groupCreationCommonMapper, "groupCreationCommonMapper");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f324848p = inputData;
        this.f324849q = interactor;
        this.f324850r = groupCreationCommonMapper;
        this.f324851s = currencyChooserFlowFactory;
        this.f324852t = bottomDialogExtension;
        this.u = mediaPickerControllerExtension;
        this.v = uiKitResources;
        this.f324853w = memberDialogMapper;
        this.f324854x = countryInteractor;
        vq9.e eVar = vq9.e.d;
        this.f324855y = new p(eVar.f291362c, inputData.f79400a, null, zhm.v.k(vq9.g.d, eVar, vq9.d.d, vq9.f.d, vq9.h.d, vq9.b.d), new Data(null, null, true, 3, null), inputData.f79402c, false);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(((e60.s) this.u).f122868g), null, null, new zfd.s(this, continuation, 27), 3);
        l2(new x(this, continuation, 1), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f324855y;
    }
}
