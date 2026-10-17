package rk;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.lifecycle.ViewModelKt;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.meshconnect.link.entity.LinkEvent;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n2m.f;
import nk.d;
import r40.n0;
import skm.e0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkActivity f254710b;

    public /* synthetic */ c(LinkActivity linkActivity, int i) {
        this.f254709a = i;
        this.f254710b = linkActivity;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f254709a;
        int i2 = 0;
        LinkActivity linkActivity = this.f254710b;
        switch (i) {
            case 0:
                MaterialAlertDialogBuilder alertDialog = (MaterialAlertDialogBuilder) obj2;
                int i3 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(alertDialog, "$this$alertDialog");
                alertDialog.setTitle(R.string.exitDialog_title);
                alertDialog.setMessage(R.string.exitDialog_message);
                alertDialog.setPositiveButton(R.string.exitDialog_exit, (DialogInterface.OnClickListener) new f(linkActivity));
                alertDialog.setNegativeButton(R.string.exitDialog_cancel, (DialogInterface.OnClickListener) null);
                alertDialog.setCancelable(false);
                alertDialog.show();
                return Unit.f186387a;
            case 1:
                String json = (String) obj2;
                int i5 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(json, "it");
                nk.f fVar = (nk.f) linkActivity.f49862b0.getValue();
                fVar.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                e0.C(ViewModelKt.getViewModelScope(fVar), fVar.u, null, new d(fVar, json, null), 2);
                return Unit.f186387a;
            case 2:
                LinkEvent event = (LinkEvent) obj2;
                int i6 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof LinkEvent.Close) || Intrinsics.f(event, LinkEvent.Done.INSTANCE)) {
                    linkActivity.finish();
                } else if (event instanceof LinkEvent.ShowClose) {
                    c block = new c(linkActivity, i2);
                    Intrinsics.checkNotNullParameter(linkActivity, "<this>");
                    Intrinsics.checkNotNullParameter(block, "block");
                    block.invoke(new MaterialAlertDialogBuilder(linkActivity));
                } else if (event instanceof LinkEvent.Loaded) {
                    String stringExtra = linkActivity.getIntent().getStringExtra("access_tokens");
                    Intrinsics.checkNotNullParameter("3.4.4", "version");
                    StringBuilder sb6 = new StringBuilder("window.meshSdkPlatform='android';window.meshSdkVersion='3.4.4'");
                    if (stringExtra != null) {
                        sb6.append(";window.accessTokens='" + stringExtra + CoreConstants.SINGLE_QUOTE_CHAR);
                    }
                    String string = sb6.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    ((mk.a) linkActivity.f49861a0.getValue()).f.evaluateJavascript(string, null);
                } else if (!(event instanceof LinkEvent.Payload)) {
                    if (!(event instanceof LinkEvent.TrueAuth)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.checkNotNullParameter(linkActivity, "<this>");
                    Toast.makeText(linkActivity, R.string.integration_disabled, 0).show();
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                int i21 = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(it8, "it");
                String text = it8.getMessage();
                if (text != null && text.length() != 0) {
                    if (text.length() <= 38) {
                        Intrinsics.checkNotNullParameter(linkActivity, "<this>");
                        Intrinsics.checkNotNullParameter(text, "text");
                        Toast.makeText(linkActivity, text, 0).show();
                    } else {
                        n0 block2 = new n0(text, 12);
                        Intrinsics.checkNotNullParameter(linkActivity, "<this>");
                        Intrinsics.checkNotNullParameter(block2, "block");
                        block2.invoke(new MaterialAlertDialogBuilder(linkActivity));
                    }
                }
                return Unit.f186387a;
        }
    }
}
