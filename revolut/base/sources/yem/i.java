package yem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Externalizable {
    public boolean d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f313074g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f313071a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f313072b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f313073c = new ArrayList();
    public String e = "";
    public boolean f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f313075h = "";

    public final String a(int i) {
        return (String) this.f313073c.get(i);
    }

    public final int b() {
        return this.f313073c.size();
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f313071a;
    }

    public final String getFormat() {
        return this.f313072b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.f313071a = objectInput.readUTF();
        this.f313072b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.f313073c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.d = true;
            this.e = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.f313074g = true;
            this.f313075h = utf3;
        }
        this.f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f313071a);
        objectOutput.writeUTF(this.f313072b);
        ArrayList arrayList = this.f313073c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.e);
        }
        objectOutput.writeBoolean(this.f313074g);
        if (this.f313074g) {
            objectOutput.writeUTF(this.f313075h);
        }
        objectOutput.writeBoolean(this.f);
    }
}
