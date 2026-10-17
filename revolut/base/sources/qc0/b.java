package qc0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba0.g;
import com.revolut.core.backend_flow.R$layout;
import com.revolut.core.backend_flow.domain.model.PermissionFlowResult;
import com.revolut.core.backend_flow.ui.BackendFlowActivity$onCreate$3;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.List;
import java.util.Stack;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b extends BaseDelegatesActivity implements l {
    public static final /* synthetic */ int F0 = 0;
    public final Object A0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public k f244393r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public zd7.b f244394s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Lazy f244395t0;
    public final Lazy u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Lazy f244396v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Lazy f244397w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Lazy f244398x0;
    public final Object z0;
    public final Object y0 = te0.w.y0(new qba.c(3));
    public final ihm.f B0 = v0.a.d("create(...)");
    public final ihm.f C0 = v0.a.d("create(...)");
    public final ihm.f D0 = v0.a.d("create(...)");
    public final ihm.f E0 = v0.a.d("create(...)");

    public b() {
        final int i = 0;
        this.f244395t0 = yhm.j.b(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                b bVar = this.f244389b;
                switch (i2) {
                    case 0:
                        int i3 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i5 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i6 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i21 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i22 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i32 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i2 = 1;
        this.u0 = yhm.j.b(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.f244389b;
                switch (i22) {
                    case 0:
                        int i3 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i5 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i6 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i21 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i32 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i3 = 2;
        this.f244396v0 = yhm.j.b(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                b bVar = this.f244389b;
                switch (i22) {
                    case 0:
                        int i32 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i5 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i6 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i21 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i322 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i5 = 3;
        this.f244397w0 = yhm.j.b(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                b bVar = this.f244389b;
                switch (i22) {
                    case 0:
                        int i32 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i59 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i6 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i21 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i322 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i6 = 4;
        this.f244398x0 = yhm.j.b(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                b bVar = this.f244389b;
                switch (i22) {
                    case 0:
                        int i32 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i59 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i66 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i21 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i322 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i21 = 5;
        this.z0 = te0.w.y0(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                b bVar = this.f244389b;
                switch (i22) {
                    case 0:
                        int i32 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i59 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i66 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i212 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i322 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
        final int i22 = 6;
        this.A0 = te0.w.y0(new Function0(this) { // from class: qc0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f244389b;

            {
                this.f244389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                b bVar = this.f244389b;
                switch (i222) {
                    case 0:
                        int i32 = b.F0;
                        return (LargeActionButton) bVar.findViewById(R$id.next_button);
                    case 1:
                        int i59 = b.F0;
                        return bVar.findViewById(R$id.bottom_layout);
                    case 2:
                        int i66 = b.F0;
                        return (RecyclerView) bVar.findViewById(com.revolut.core.backend_flow.R$id.backendFlow_actionsRecyclerView);
                    case 3:
                        int i212 = b.F0;
                        return (FrameLayout) bVar.findViewById(com.revolut.core.backend_flow.R$id.fragment_container);
                    case 4:
                        int i2222 = b.F0;
                        return (NavBarWithToolbar) bVar.findViewById(com.revolut.core.backend_flow.R$id.navBarWithToolbar);
                    case 5:
                        int i322 = b.F0;
                        return zhm.u.c((LargeActionButtonDelegate) bVar.y0.getValue());
                    default:
                        return new z4l.j(7, (List) bVar.z0.getValue(), false);
                }
            }
        });
    }

    public abstract zc0.h Z0();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object hVar;
        Object bVar;
        Object obj2;
        super.onActivityResult(i, i2, intent);
        if (i == 133) {
            this.B0.onNext(i2 == -1 ? ba0.i.SUCCESS : ba0.i.CANCEL);
            return;
        }
        if (i == 144) {
            if (i2 == -1) {
                String stringExtra = intent != null ? intent.getStringExtra("CARD_ID_KEY") : null;
                if (stringExtra == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                BackendFlowUploadResult backendFlowUploadResult = intent != null ? (BackendFlowUploadResult) intent.getParcelableExtra("CARD_PHOTO_RESULT_KEY") : null;
                if (backendFlowUploadResult == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                hVar = new ba0.h(stringExtra, backendFlowUploadResult);
            } else {
                hVar = g.a.f13872a;
            }
            this.C0.onNext(hVar);
            return;
        }
        if (i == 155) {
            if (i2 == -1) {
                AddressFlowContract$OutputData addressFlowContract$OutputData = intent != null ? (AddressFlowContract$OutputData) intent.getParcelableExtra("ADDRESS_FLOW_RESULT") : null;
                if (addressFlowContract$OutputData == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar = new ba0.b(addressFlowContract$OutputData);
            } else {
                bVar = ba0.a.f13861a;
            }
            this.D0.onNext(bVar);
            return;
        }
        if (i != 166) {
            return;
        }
        if (i2 == -1) {
            obj2 = intent != null ? (PermissionFlowResult) intent.getParcelableExtra("PERMISSION_FLOW_RESULT_KEY") : null;
            if (obj2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            obj2 = PermissionFlowResult.Cancelled.f51224a;
        }
        this.E0.onNext(obj2);
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        i iVar = (i) this.f218652a0;
        if (iVar != null) {
            ((y0) iVar).f244511w.onNext(new Object());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_backend_flow);
        Lazy lazy = this.f244395t0;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LargeActionButton) value).o(LargeActionButton.ButtonStyle.f58725a);
        Object value2 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LargeActionButton) value2).setOnClickListener(new c9(this, 8));
        Object value3 = this.u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((View) value3).addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 22));
        Lazy lazy2 = this.f244398x0;
        Object value4 = lazy2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((NavBarWithToolbar) value4).setTitleAutoSize(true);
        Object value5 = lazy2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((NavBarWithToolbar) value5).setHeaderTitleMode(tx0.j0.MULTILINE);
        zd7.b bVar = this.f244394s0;
        if (bVar == null) {
            Intrinsics.r("imagePickerBottomDialog");
            throw null;
        }
        ((ae7.i) bVar).a(this);
        Object value6 = this.f244396v0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        yp0.y.h((RecyclerView) value6, (z4l.j) this.A0.getValue(), new BackendFlowActivity$onCreate$3(this));
        if (bundle == null) {
            k kVar = this.f244393r0;
            if (kVar != null) {
                kVar.r0().set(new Stack());
            } else {
                Intrinsics.r("backendFlowState");
                throw null;
            }
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        i iVar = (i) this.f218652a0;
        if (iVar != null) {
            iVar.d();
        }
    }
}
