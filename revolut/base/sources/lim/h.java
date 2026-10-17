package lim;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends zhm.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f195568c;
    public final /* synthetic */ j d;

    public h(j jVar) {
        this.d = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f195568c = arrayDeque;
        File file = jVar.f195570a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new e(file));
        } else {
            this.f322461a = 2;
        }
    }

    @Override // zhm.b
    public final void a() {
        File file;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f195568c;
            i iVar = (i) arrayDeque.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            fileA = iVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (fileA.equals(iVar.f195569a) || !fileA.isDirectory() || arrayDeque.size() >= this.d.f) {
                break;
            } else {
                arrayDeque.push(b(fileA));
            }
        }
        file = fileA;
        if (file == null) {
            this.f322461a = 2;
        } else {
            this.f322462b = file;
            this.f322461a = 1;
        }
    }

    public final c b(File file) {
        int i = g.f195567a[this.d.f195571b.ordinal()];
        if (i == 1) {
            return new f(this, file);
        }
        if (i == 2) {
            return new d(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
