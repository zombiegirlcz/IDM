package yem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f313096a;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f313097b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f313098c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public String f = "";

    public final String a() {
        return this.f313097b;
    }

    public final int b() {
        return ((Integer) this.f313098c.get(0)).intValue();
    }

    public final int c() {
        return this.f313098c.size();
    }

    public final ArrayList d() {
        return this.f313098c;
    }

    public final ArrayList e() {
        return this.d;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.f313096a = true;
            this.f313097b = utf2;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f313098c.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i5 = 0; i5 < i3; i5++) {
            this.d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.e = true;
            this.f = utf3;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f313096a);
        if (this.f313096a) {
            objectOutput.writeUTF(this.f313097b);
        }
        ArrayList arrayList = this.f313098c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) arrayList.get(i)).intValue());
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }
}
