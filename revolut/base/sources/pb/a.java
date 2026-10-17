package pb;

import com.fourthline.orca.internal.v10;
import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v10 f234580b;

    public /* synthetic */ a(v10 v10Var, int i) {
        this.f234579a = i;
        this.f234580b = v10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f234579a) {
            case 0:
                return QesErrorPopupStateBuilder.exitErrorPopupState_delegate$lambda$0(this.f234580b);
            case 1:
                return QesErrorPopupStateBuilder.tooManyAuthoriseAttemptPopupState_delegate$lambda$0(this.f234580b);
            case 2:
                return QesErrorPopupStateBuilder.tooManySessionsPopupState_delegate$lambda$0(this.f234580b);
            case 3:
                return QesErrorPopupStateBuilder.nonRecoverableErrorPopupState_delegate$lambda$0(this.f234580b);
            case 4:
                return WorkerErrorPopupStateBuilder.connectionLostErrorPopupState_delegate$lambda$0(this.f234580b);
            case 5:
                return WorkerErrorPopupStateBuilder.recoverableErrorPopupState_delegate$lambda$0(this.f234580b);
            default:
                return WorkerErrorPopupStateBuilder.fatalErrorPopupState_delegate$lambda$0(this.f234580b);
        }
    }
}
