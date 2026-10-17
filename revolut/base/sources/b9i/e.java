package b9i;

import android.net.Uri;
import android.text.TextUtils;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f13786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13787c;

    public /* synthetic */ e(l lVar, String str, int i) {
        this.f13785a = i;
        this.f13786b = lVar;
        this.f13787c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f13785a;
        l lVar = this.f13786b;
        switch (i) {
            case 0:
                String str2 = this.f13787c;
                yoj.f features = (yoj.f) obj2;
                Intrinsics.checkNotNullParameter(features, "features");
                lVar.getClass();
                try {
                } catch (Exception e) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, null, null, e, null, 22);
                }
                if (TextUtils.isEmpty(Uri.parse(str2).getScheme())) {
                    str = "http://" + str2;
                    break;
                } else {
                    str = str2;
                }
                return new ufm.f(o70.a.i(((s06.j) lVar.f13800m).c(str, false, lg0.a.IGNORE)), new b79.g(new e(lVar, str2, 1), 14), 3);
            default:
                if (!((Boolean) obj2).booleanValue()) {
                    lVar.f13798j.c(new FeatureCommand(new WebViewFeatureConfig(this.f13787c, null, 0, true, true, false, 130844)));
                }
                return Unit.f186387a;
        }
    }
}
