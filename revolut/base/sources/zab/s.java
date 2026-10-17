package zab;

import kotlin.jvm.functions.Function1;
import zc0.y2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0239  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zab.s.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s() {
        super(1, 0, sd0.i.class, sd0.i.f261795a, "initialize", "initialize(Ljava/util/Map;)V");
        this.f = 29;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ihm.b bVar, int i) {
        super(1, 0, ihm.k.class, bVar, "onNext", "onNext(Ljava/lang/Object;)V");
        this.f = i;
        switch (i) {
            case 16:
                super(1, 0, ihm.k.class, bVar, "onNext", "onNext(Ljava/lang/Object;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Object obj2, int i) {
        super(1, 0, zc0.g.class, obj2, "switchTransaction", "switchTransaction(Lcom/revolut/feature/backend_flow/domain/models/SelectedTransaction;)Lio/reactivex/Completable;");
        this.f = i;
        switch (i) {
            case 14:
                super(1, 0, qc0.j.class, obj2, "openChooserScreen", "openChooserScreen(Ljava/lang/String;)Lio/reactivex/Completable;");
                break;
            case 17:
                super(1, 0, zc0.g.class, obj2, "uploadMedias", "uploadMedias(Ljava/util/List;)Lio/reactivex/Completable;");
                break;
            case 22:
                super(1, 0, ypi.i.class, obj2, "setAnalyticsContext", "setAnalyticsContext(Landroid/os/Parcelable;)V");
                break;
            case 23:
                super(1, 0, qc0.j.class, obj2, "openLink", "openLink(Ljava/lang/String;)Lio/reactivex/Completable;");
                break;
            case 25:
                super(1, 0, npi.a.class, obj2, "showDialog", "showDialog(Lcom/revolut/core/ui_kit/dialogs/AlertDialogDisplayer$Configuration;)V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y2 y2Var, int i) {
        super(1, 0, y2.class, y2Var, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V");
        this.f = i;
        switch (i) {
            case 20:
                super(1, 0, y2.class, y2Var, "showDialog", "showDialog(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)Lio/reactivex/Completable;");
                break;
            case 21:
                super(1, 0, y2.class, y2Var, "showPrompt", "showPrompt(Lcom/revolut/retail/common/ui/activity/delegate/prompt/PromptDialogConfiguration;)Lio/reactivex/Completable;");
                break;
            case 22:
            case 23:
            default:
                break;
            case 24:
                super(1, 0, y2.class, y2Var, "showDialog", "showDialog(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$Model;)Lio/reactivex/Completable;");
                break;
        }
    }
}
