package mx0;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j4 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final urg.a f209775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f209776c;
    public final PointF d;
    public final GestureDetector e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ChatInputView f209777g;

    public j4(Context context, ChatInputView chatInputView, int i, urg.a recordAudioViewModel) {
        this.f209777g = chatInputView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recordAudioViewModel, "recordAudioViewModel");
        this.f209774a = i;
        this.f209775b = recordAudioViewModel;
        this.d = new PointF();
        this.e = new GestureDetector(context, this);
        this.f = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float rawX = event.getRawX();
        PointF pointF = this.d;
        pointF.x = rawX;
        pointF.y = event.getRawY();
        this.f209776c = true;
        ChatInputView chatInputView = this.f209777g;
        if (chatInputView.p0) {
            chatInputView.O.onNext(Unit.f186387a);
            return;
        }
        chatInputView.performHapticFeedback(0);
        urg.a aVar = chatInputView.m0;
        if (aVar != null) {
            aVar.h3();
        } else {
            Intrinsics.r("recordAudioViewModel");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r9 != 3) goto L44;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r9 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r9)
            boolean r9 = r8.f
            r0 = 0
            if (r9 != 0) goto L11
            goto La1
        L11:
            int r9 = r10.getAction()
            r1 = 1
            if (r9 != 0) goto L25
            urg.a r9 = r8.f209775b
            boolean r2 = r9.b3()
            if (r2 == 0) goto L21
            goto L25
        L21:
            r9.e3()
            return r1
        L25:
            android.view.GestureDetector r9 = r8.e
            boolean r9 = r9.onTouchEvent(r10)
            if (r9 == 0) goto L2e
            return r1
        L2e:
            boolean r9 = r8.f209776c
            if (r9 != 0) goto L33
            goto La1
        L33:
            int r9 = r10.getAction()
            r2 = 0
            java.lang.String r3 = "recordAudioViewModel"
            com.revolut.core.ui_kit.views.ChatInputView r4 = r8.f209777g
            if (r9 == r1) goto La2
            r5 = 2
            if (r9 == r5) goto L45
            r10 = 3
            if (r9 == r10) goto La2
            goto La1
        L45:
            float r9 = r10.getRawX()
            android.graphics.PointF r5 = r8.d
            float r6 = r5.x
            float r9 = r9 - r6
            float r10 = r10.getRawY()
            float r5 = r5.y
            float r10 = r10 - r5
            float r5 = r9 * r9
            float r6 = r10 * r10
            float r6 = r6 + r5
            double r5 = (double) r6
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            int r6 = r8.f209774a
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L68
            goto La1
        L68:
            r5 = 0
            int r6 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r6 >= 0) goto L87
            float r6 = java.lang.Math.abs(r9)
            float r7 = java.lang.Math.abs(r10)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L87
            r8.f209776c = r0
            urg.a r9 = r4.m0
            if (r9 == 0) goto L83
            r9.Z2()
            return r1
        L83:
            kotlin.jvm.internal.Intrinsics.r(r3)
            throw r2
        L87:
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto La1
            float r9 = java.lang.Math.abs(r9)
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto La1
            r8.f209776c = r0
            mx0.d4 r9 = mx0.d4.HANDS_FREE
            int r10 = com.revolut.core.ui_kit.views.ChatInputView.I0
            r4.Z(r9, r0)
            return r1
        La1:
            return r0
        La2:
            r8.f209776c = r0
            urg.a r9 = r4.m0
            if (r9 == 0) goto Lb1
            r9.j3()
            mx0.d4 r9 = mx0.d4.IDLE
            r4.Z(r9, r0)
            return r1
        Lb1:
            kotlin.jvm.internal.Intrinsics.r(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.j4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
