package ar0;

import android.content.Context;
import android.os.Handler;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.onfido.android.sdk.capture.audio.VolumeWarningView;
import com.onfido.android.sdk.capture.databinding.OnfidoButtonBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoVolumeAwareViewBinding;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.r;
import com.revolut.core.ui_kit.internal.delegates.tabs.InternalTabDelegate;
import com.revolut.core.ui_kit.internal.views.SwitcherView;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleSuggestionView;
import ip0.t40;
import ip0.ze;
import ix0.c0;
import kotlin.jvm.internal.Intrinsics;
import sgm.j1;
import wv0.d;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8479c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f8477a = i;
        this.f8478b = obj2;
        this.f8479c = obj3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ItemTouchHelper itemTouchHelper;
        int i = this.f8477a;
        Object obj2 = this.f8479c;
        Object obj3 = this.f8478b;
        switch (i) {
            case 0:
                InternalTabDelegate internalTabDelegate = (InternalTabDelegate) obj3;
                h hVar = (h) obj2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    internalTabDelegate.f55880c.invoke(hVar);
                } else {
                    if (action != 1) {
                        view.performClick();
                        return false;
                    }
                    internalTabDelegate.d.invoke(hVar);
                }
                return true;
            case 1:
                return VolumeWarningView.lambda$4$lambda$3((OnfidoVolumeAwareViewBinding) obj3, (Context) obj2, view, motionEvent);
            case 2:
                return OnfidoButton.lambda$1$lambda$0((OnfidoButtonBinding) obj3, (Context) obj2, view, motionEvent);
            case 3:
                ChatBubbleSuggestionView chatBubbleSuggestionView = (ChatBubbleSuggestionView) obj2;
                int i2 = ChatBubbleSuggestionView.f56812g;
                Intrinsics.i(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                Intrinsics.i(text, "null cannot be cast to non-null type android.text.Spannable");
                Intrinsics.h(motionEvent);
                return ((c0) obj3).onTouchEvent(textView, (Spannable) text, motionEvent) || chatBubbleSuggestionView.onTouchEvent(motionEvent);
            case 4:
                r rVar = (r) obj2;
                Intrinsics.i(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) view;
                CharSequence text2 = textView2.getText();
                Intrinsics.i(text2, "null cannot be cast to non-null type android.text.Spannable");
                Intrinsics.h(motionEvent);
                return ((c0) obj3).onTouchEvent(textView2, (Spannable) text2, motionEvent) || rVar.itemView.onTouchEvent(motionEvent);
            case 5:
                ze zeVar = (ze) obj3;
                DraggableDelegate draggableDelegate = (DraggableDelegate) obj2;
                DraggableDelegate.Companion aVar = DraggableDelegate.INSTANCE;
                TouchDelegate touchDelegate = zeVar.k.getTouchDelegate();
                if ((touchDelegate == null || !touchDelegate.onTouchEvent(motionEvent)) && motionEvent.getAction() == 0 && (itemTouchHelper = draggableDelegate.d) != null) {
                    itemTouchHelper.startDrag(zeVar);
                }
                return true;
            case 6:
                InputChecklistDelegate inputChecklistDelegate = (InputChecklistDelegate) obj3;
                InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) obj2;
                if (motionEvent.getAction() == 1) {
                    inputChecklistDelegate.f52518c.onNext(model);
                }
                return false;
            case 7:
                t40 t40Var = (t40) obj2;
                Intrinsics.i(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) view;
                CharSequence text3 = textView3.getText();
                Intrinsics.i(text3, "null cannot be cast to non-null type android.text.Spannable");
                Intrinsics.h(motionEvent);
                return ((c0) obj3).onTouchEvent(textView3, (Spannable) text3, motionEvent) || t40Var.itemView.onTouchEvent(motionEvent);
            case 8:
                SwitcherView switcherView = (SwitcherView) obj3;
                View.OnTouchListener onTouchListener = (View.OnTouchListener) obj2;
                int i3 = SwitcherView.f56428c;
                if (motionEvent.getAction() == 1) {
                    switcherView.f56429a.b0();
                }
                return onTouchListener.onTouch(view, motionEvent);
            default:
                ImageButton imageButton = (ImageButton) obj3;
                wv0.d dVar = (wv0.d) obj2;
                j1 j1Var = dVar.f300257c;
                Handler handler = dVar.f300256b;
                d.a aVar2 = wv0.d.Companion;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    imageButton.setPressed(true);
                    InputConnection inputConnection = dVar.f300255a;
                    if (inputConnection != null) {
                        inputConnection.deleteSurroundingText(1, 0);
                    }
                    imageButton.performHapticFeedback(3);
                    handler.postDelayed(j1Var, 400L);
                } else {
                    if (action2 != 1 && action2 != 3) {
                        return false;
                    }
                    imageButton.setPressed(false);
                    handler.removeCallbacks(j1Var);
                }
                return true;
        }
    }
}
