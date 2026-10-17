package et0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewKt;
import au0.x5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleView;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import mx0.m4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z extends ViewGroup implements View.OnLayoutChangeListener, xo0.f {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f129150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenContentRecyclerView f129151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final goi.h f129152c;
    public final ChatInputView d;
    public final float[] e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f129153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f129154h;
    public final float[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lq0.p f129155j;
    public final jq0.q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xo0.d f129156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xo0.d f129157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f129158n;
    public kp0.u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f129159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f129160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f129161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f129162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function1 f129163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ControllerContainerCoordinatorLayout host, ScreenContentRecyclerView recycler, ChatInputLayoutView chatInputLayout, goi.h paddingController) {
        super(host.getContext());
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(chatInputLayout, "chatInputLayout");
        Intrinsics.checkNotNullParameter(paddingController, "paddingController");
        this.f129150a = host;
        this.f129151b = recycler;
        this.f129152c = paddingController;
        this.d = chatInputLayout.getInputView();
        this.e = new float[2];
        this.f = new float[2];
        this.f129154h = new Paint(1);
        this.i = new float[2];
        jq0.q qVar = new jq0.q();
        this.k = qVar;
        Intrinsics.checkNotNullParameter(this, "callback");
        qVar.f177390q = this;
        recycler.setItemAnimator(qVar);
        host.addOnLayoutChangeListener(this);
        host.getOverlay().add(this);
        setWillNotDraw(false);
    }

    public static final void c(z zVar, kp0.u uVar) {
        jq0.q qVar = zVar.k;
        long moveDuration = qVar.getMoveDuration();
        boolean z = qVar.f154305c;
        qVar.setMoveDuration(450L);
        qVar.f154305c = true;
        int i = zVar.f129152c.d;
        int i2 = zVar.f129158n;
        zVar.f129160q = true;
        zVar.g();
        uVar.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        OneShotPreDrawListener.add(zVar, new x(zVar, zVar, moveDuration, z, uVar, i2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p getAttachmentsView() {
        return this.d.getAttachmentCarouselView();
    }

    public static /* synthetic */ void getInputTransitionController$ui_kit_components_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m4 getReplyToView() {
        return this.d.getReplyToView();
    }

    public final void d() {
        goi.h hVar = this.f129152c;
        if (!hVar.f145169b) {
            hVar.f145169b = true;
        }
        ChatInputView chatInputView = this.d;
        this.f129153g = ViewKt.drawToBitmap$default(chatInputView.getInput$ui_kit_components_release(), null, 1, null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = chatInputView;
        while (true) {
            Object obj2 = ref$ObjectRef.f186409a;
            if (obj2 == null || Intrinsics.f(((ViewGroup) obj2).getParent(), this.f129150a)) {
                break;
            }
            ViewParent parent = ((ViewGroup) ref$ObjectRef.f186409a).getParent();
            ref$ObjectRef.f186409a = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        if (ref$ObjectRef.f186409a == null) {
            ref$ObjectRef.f186409a = chatInputView;
        }
        u listener = new u(ref$ObjectRef, 0);
        lq0.v vVar = new lq0.v();
        Intrinsics.checkNotNullParameter(listener, "listener");
        ArrayList arrayList = vVar.f199171b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            vVar.f199171b = arrayList;
        }
        if (!arrayList.contains(listener)) {
            arrayList.add(listener);
        }
        lq0.o oVar = lq0.p.Companion;
        ViewGroup viewGroup = (ViewGroup) ref$ObjectRef.f186409a;
        oVar.getClass();
        this.f129155j = lq0.o.a(viewGroup, vVar);
    }

    public final void e() {
        goi.h hVar = this.f129152c;
        if (hVar.f145169b) {
            hVar.f145169b = false;
            hVar.a(hVar.d, true);
        }
        this.f129153g = null;
        lq0.p pVar = this.f129155j;
        if (pVar != null) {
            pVar.a();
        }
        this.f129155j = null;
    }

    public final void f(long j2, boolean z) {
        m4 replyToView = getReplyToView();
        if (replyToView != null) {
            replyToView.setDeferredUpdatesMode$ui_kit_components_release(z, j2);
        }
        p attachmentsView = getAttachmentsView();
        if (attachmentsView != null) {
            attachmentsView.setDeferredUpdatesMode(z, j2);
        }
    }

    public final void g() {
        boolean z = this.f129160q || this.f129161r || this.f129162s;
        if (this.f129159p != z) {
            this.f129159p = z;
            if (!z) {
                this.o = null;
            }
            Function1<Boolean, Unit> stateChangeListener = getStateChangeListener();
            if (stateChangeListener != null) {
                stateChangeListener.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final lq0.p getInputTransitionController$ui_kit_components_release() {
        return this.f129155j;
    }

    public Function1<Boolean, Unit> getStateChangeListener() {
        return this.f129163t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ChatBubbleView chatBubbleView;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f129162s) {
            kp0.u uVar = this.o;
            if (uVar != null && (chatBubbleView = uVar.i) != null) {
                float[] fArr = this.i;
                float left = fArr[0] - chatBubbleView.getLeft();
                float top = fArr[1] - chatBubbleView.getTop();
                int iSave = canvas.save();
                canvas.translate(left, top);
                try {
                    drawChild(canvas, chatBubbleView, getDrawingTime());
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            Bitmap bitmap = this.f129153g;
            if (bitmap != null) {
                float[] fArr2 = this.f;
                canvas.drawBitmap(bitmap, fArr2[0], fArr2[1], this.f129154h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        layout(0, 0, i3, i5);
    }

    public final void setInputTransitionController$ui_kit_components_release(lq0.p pVar) {
        this.f129155j = pVar;
    }

    @Override // xo0.f
    public void setLastSentMessageData(@NotNull xo0.d data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.f(data, this.f129156l)) {
            return;
        }
        this.f129156l = data;
        if (this.o == null) {
            e();
            f(0L, true);
            this.f129157m = data;
            int i = t.f129113a[data.f307543b.ordinal()];
            goi.h hVar = this.f129152c;
            if (i == 1 || i == 2) {
                ChatInputView chatInputView = this.d;
                MaskedTextInputEditText input$ui_kit_components_release = chatInputView.getInput$ui_kit_components_release();
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = this.f129150a;
                float f = knm.b.f(input$ui_kit_components_release, controllerContainerCoordinatorLayout);
                float[] fArr = this.f;
                fArr[0] = f;
                fArr[1] = knm.b.h(input$ui_kit_components_release, controllerContainerCoordinatorLayout);
                ConstraintLayout inputContainer$ui_kit_components_release = chatInputView.getInputContainer$ui_kit_components_release();
                float f4 = knm.b.f(inputContainer$ui_kit_components_release, controllerContainerCoordinatorLayout);
                float[] fArr2 = this.e;
                fArr2[0] = f4;
                fArr2[1] = knm.b.h(inputContainer$ui_kit_components_release, controllerContainerCoordinatorLayout);
                this.f129158n = hVar.d;
                d();
            } else if (i == 3) {
                this.f129158n = hVar.d;
                d();
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            OneShotPreDrawListener.add(this, new x5(this, data, this, 6));
        }
    }

    public void setStateChangeListener(Function1<? super Boolean, Unit> function1) {
        this.f129163t = function1;
    }
}
