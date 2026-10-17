package au0;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.uicomponent.text.PhoneEditorView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l4 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f9266b;

    public /* synthetic */ l4(FrameLayout frameLayout, int i) {
        this.f9265a = i;
        this.f9266b = frameLayout;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String string;
        String string2;
        int i2 = this.f9265a;
        String str = "";
        FrameLayout frameLayout = this.f9266b;
        switch (i2) {
            case 0:
                SearchView searchView = (SearchView) frameLayout;
                if (i != 3) {
                    SearchView.a aVar = SearchView.Companion;
                } else {
                    ihm.f fVar = searchView.o;
                    CharSequence text = textView.getText();
                    if (text != null && (string = text.toString()) != null) {
                        str = string;
                    }
                    fVar.onNext(str);
                }
                break;
            case 1:
                PhoneEditorView phoneEditorView = (PhoneEditorView) frameLayout;
                if (i != 6) {
                    PhoneEditorView.a aVar2 = PhoneEditorView.Companion;
                } else {
                    Function0 function0 = phoneEditorView.f107276a;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                break;
            default:
                ChatInputView chatInputView = (ChatInputView) frameLayout;
                if (i != 3) {
                    int i3 = ChatInputView.I0;
                } else {
                    ihm.f fVar2 = chatInputView.N;
                    CharSequence text2 = textView.getText();
                    if (text2 != null && (string2 = text2.toString()) != null) {
                        str = string2;
                    }
                    fVar2.onNext(str);
                }
                break;
        }
        return false;
    }
}
