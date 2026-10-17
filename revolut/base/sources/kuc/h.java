package kuc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f189772b;

    public /* synthetic */ h(l lVar, int i) {
        this.f189771a = i;
        this.f189772b = lVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f189771a) {
            case 0:
                this.f189772b.q2().d(new mii.k("GAMBLING_BLOCK_ENABLE_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.gambling_block_result_enabled_toast_title, null, null, 14), null, null, null, 28));
                break;
            default:
                this.f189772b.q2().d(new mii.k("GAMBLING_BLOCK_DISABLE_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.gambling_block_result_disabled_title, null, null, 14), null, null, null, 28));
                break;
        }
    }
}
