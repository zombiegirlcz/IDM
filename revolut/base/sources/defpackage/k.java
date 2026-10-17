package defpackage;

import com.youTransactor.uCube.AbstractService;
import com.youTransactor.uCube.rpc.command.CancelCommand;

/* JADX INFO: loaded from: classes15.dex */
public final class k extends AbstractService {
    public final String H;

    public k(String str) {
        this.H = str;
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        new CancelCommand().execute(new j(this, 0));
    }
}
