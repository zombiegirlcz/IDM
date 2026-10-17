package defpackage;

import com.youTransactor.uCube.AbstractService;
import com.youTransactor.uCube.rpc.command.CancelCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 extends AbstractService {
    public final /* synthetic */ int H;

    public /* synthetic */ l1(int i) {
        this.H = i;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        switch (this.H) {
            case 0:
                new CancelCommand().execute(new k1(this, 0));
                break;
            default:
                new CancelCommand().execute(new p1(this, 0));
                break;
        }
    }
}
