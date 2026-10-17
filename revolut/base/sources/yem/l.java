package yem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f313095a = new ArrayList();

    public final ArrayList a() {
        return this.f313095a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            k kVar = new k();
            kVar.readExternal(objectInput);
            this.f313095a.add(kVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.f313095a;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((k) arrayList.get(i)).writeExternal(objectOutput);
        }
    }
}
