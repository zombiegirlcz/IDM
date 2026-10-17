package ud6;

import android.os.Build;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.esim.instructions.R$string;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import dfj.n0;
import ip0.t5;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u7k.f0;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements f {
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0 f279159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EsimInstructionsControllerDescriptor$InputData f279160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vd6.a f279161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f279162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f279163t;

    public h(c70.a clipboard, i stateMapper, n0 instructionsInteractor, EsimInstructionsControllerDescriptor$InputData inputData, vd6.a clipboardFeedbackRequirementProvider) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(instructionsInteractor, "instructionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboardFeedbackRequirementProvider, "clipboardFeedbackRequirementProvider");
        this.o = clipboard;
        this.f279159p = instructionsInteractor;
        this.f279160q = inputData;
        this.f279161r = clipboardFeedbackRequirementProvider;
        this.f279162s = new vii.b();
        this.f279163t = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f279162s, new tik.b(continuation, this, 29)), null, new f0(this, continuation, 22), 3);
    }

    public final void I2(t5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.e;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null && a0.H(model.f166447a, "ACTIVATION_CODE_ITEM_ID", false)) {
            c70.a.b(this.o, null, str, false, 5);
            this.f279161r.getClass();
            if (Build.VERSION.SDK_INT < 33) {
                X1(new mii.i("ID_COPIED_TO_CLIPBOARD_SHOT_DIALOG", new TextLocalisedClause(R$string.esim_ui_instructions_installation_code_copied_to_clipboard, null, null, 14), null, null, 28));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279163t;
    }
}
