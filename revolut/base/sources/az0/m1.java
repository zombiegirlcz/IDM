package az0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11331c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(View view, ViewGroup viewGroup, vp0.h hVar, Function0 function0, Function0 function02) {
        this.f11329a = 4;
        this.f11330b = view;
        this.f11331c = viewGroup;
        this.d = hVar;
        this.f = function0;
        this.e = function02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11329a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.f11331c;
        Object obj6 = this.f11330b;
        switch (i) {
            case 0:
                Image image = (Image) obj5;
                ImageView imageView = (ImageView) obj4;
                Function1 function1 = (Function1) obj2;
                Function0 function0 = (Function0) obj3;
                yy0.b bVar = ((o1) obj6).f317758a;
                if (bVar != null) {
                    bVar.a(image, imageView, function1, function0);
                }
                break;
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", a0.d.u(v0.a.m("onSuccess target=", str, ", sessionId=", str2, ", sessionIdSignature="), str3, ", optionsJson=", str4), null, null, 16);
                ((mc4.g) obj6).f204275b.invoke(str, str2, str3, str4);
                break;
            case 2:
                BasicText_androidKt.BackgroundTextMeasurement$lambda$0$0((TextStyle) obj6, (LayoutDirection) obj5, (String) obj4, (Density) obj2, (FontFamily.Resolver) obj3);
                break;
            case 3:
                OperationKt.launchOperation$lambda$2$lambda$1((Tracer) obj6, (String) obj5, (Function0) obj3, (MutableLiveData) obj4, (CallbackToFutureAdapter.Completer) obj2);
                break;
            default:
                vp0.i.b(vp0.k.Companion, (View) obj6, (ViewGroup) obj5, (vp0.h) obj4, (Function0) obj3, (Function0) obj2, 32);
                break;
        }
    }

    public /* synthetic */ m1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        this.f11329a = 3;
        this.f11330b = tracer;
        this.f11331c = str;
        this.f = function0;
        this.d = mutableLiveData;
        this.e = completer;
    }

    public /* synthetic */ m1(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f11329a = i;
        this.f11330b = obj2;
        this.f11331c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }
}
