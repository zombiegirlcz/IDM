package yem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class k implements Externalizable {
    public boolean A;
    public boolean C;
    public boolean E;
    public boolean G;
    public boolean L;
    public boolean N;
    public boolean P;
    public boolean R;
    public boolean T;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f313076a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f313080c;
    public boolean e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f313081g;
    public boolean i;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f313085m;
    public boolean o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f313088q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f313090s;
    public boolean u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f313092w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f313094y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f313078b = null;
    public m d = null;
    public m f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f313082h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f313083j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f313084l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f313086n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f313087p = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f313089r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f313091t = null;
    public m v = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f313093x = null;
    public m z = null;
    public m B = null;
    public m D = null;
    public m F = null;
    public m H = null;
    public String I = "";
    public int J = 0;
    public String K = "";
    public String M = "";
    public String O = "";
    public String Q = "";
    public String S = "";
    public String U = "";
    public boolean V = false;
    public final ArrayList W = new ArrayList();
    public final ArrayList X = new ArrayList();
    public boolean Y = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f313077a0 = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f313079b0 = false;

    public void A(String str) {
        this.K = str;
    }

    public final int a() {
        return this.J;
    }

    public final m b() {
        return this.d;
    }

    public final m c() {
        return this.f313078b;
    }

    public final String d() {
        return this.K;
    }

    public final ArrayList e() {
        return this.X;
    }

    public final String f() {
        return this.f313077a0;
    }

    public final String getId() {
        return this.I;
    }

    public final m h() {
        return this.f;
    }

    public final String i() {
        return this.S;
    }

    public final String k() {
        return this.U;
    }

    public final ArrayList l() {
        return this.W;
    }

    public final m m() {
        return this.f313089r;
    }

    public final m n() {
        return this.f313086n;
    }

    public final String o() {
        return this.Q;
    }

    public final m p() {
        return this.f313083j;
    }

    public final boolean q() {
        return this.V;
    }

    public final m r() {
        return this.f313084l;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            m mVar = new m();
            mVar.readExternal(objectInput);
            this.f313076a = true;
            this.f313078b = mVar;
        }
        if (objectInput.readBoolean()) {
            m mVar2 = new m();
            mVar2.readExternal(objectInput);
            this.f313080c = true;
            this.d = mVar2;
        }
        if (objectInput.readBoolean()) {
            m mVar3 = new m();
            mVar3.readExternal(objectInput);
            this.e = true;
            this.f = mVar3;
        }
        if (objectInput.readBoolean()) {
            m mVar4 = new m();
            mVar4.readExternal(objectInput);
            this.f313081g = true;
            this.f313082h = mVar4;
        }
        if (objectInput.readBoolean()) {
            m mVar5 = new m();
            mVar5.readExternal(objectInput);
            this.i = true;
            this.f313083j = mVar5;
        }
        if (objectInput.readBoolean()) {
            m mVar6 = new m();
            mVar6.readExternal(objectInput);
            this.k = true;
            this.f313084l = mVar6;
        }
        if (objectInput.readBoolean()) {
            m mVar7 = new m();
            mVar7.readExternal(objectInput);
            this.f313085m = true;
            this.f313086n = mVar7;
        }
        if (objectInput.readBoolean()) {
            m mVar8 = new m();
            mVar8.readExternal(objectInput);
            this.o = true;
            this.f313087p = mVar8;
        }
        if (objectInput.readBoolean()) {
            m mVar9 = new m();
            mVar9.readExternal(objectInput);
            this.f313088q = true;
            this.f313089r = mVar9;
        }
        if (objectInput.readBoolean()) {
            m mVar10 = new m();
            mVar10.readExternal(objectInput);
            this.f313090s = true;
            this.f313091t = mVar10;
        }
        if (objectInput.readBoolean()) {
            m mVar11 = new m();
            mVar11.readExternal(objectInput);
            this.u = true;
            this.v = mVar11;
        }
        if (objectInput.readBoolean()) {
            m mVar12 = new m();
            mVar12.readExternal(objectInput);
            this.f313092w = true;
            this.f313093x = mVar12;
        }
        if (objectInput.readBoolean()) {
            m mVar13 = new m();
            mVar13.readExternal(objectInput);
            this.f313094y = true;
            this.z = mVar13;
        }
        if (objectInput.readBoolean()) {
            m mVar14 = new m();
            mVar14.readExternal(objectInput);
            this.A = true;
            this.B = mVar14;
        }
        if (objectInput.readBoolean()) {
            m mVar15 = new m();
            mVar15.readExternal(objectInput);
            this.C = true;
            this.D = mVar15;
        }
        if (objectInput.readBoolean()) {
            m mVar16 = new m();
            mVar16.readExternal(objectInput);
            this.E = true;
            this.F = mVar16;
        }
        if (objectInput.readBoolean()) {
            m mVar17 = new m();
            mVar17.readExternal(objectInput);
            this.G = true;
            this.H = mVar17;
        }
        y(objectInput.readUTF());
        this.J = objectInput.readInt();
        A(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.L = true;
            this.M = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.N = true;
            this.O = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.P = true;
            this.Q = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.R = true;
            this.S = utf5;
        }
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.T = true;
            this.U = utf6;
        }
        this.V = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            i iVar = new i();
            iVar.readExternal(objectInput);
            this.W.add(iVar);
        }
        int i3 = objectInput.readInt();
        for (int i5 = 0; i5 < i3; i5++) {
            i iVar2 = new i();
            iVar2.readExternal(objectInput);
            this.X.add(iVar2);
        }
        this.Y = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf7 = objectInput.readUTF();
            this.Z = true;
            this.f313077a0 = utf7;
        }
        this.f313079b0 = objectInput.readBoolean();
    }

    public final m s() {
        return this.f313082h;
    }

    public final m t() {
        return this.f313091t;
    }

    public final m u() {
        return this.f313093x;
    }

    public final m v() {
        return this.f313087p;
    }

    public final boolean w() {
        return this.Z;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.f313076a);
        if (this.f313076a) {
            this.f313078b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313080c);
        if (this.f313080c) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313081g);
        if (this.f313081g) {
            this.f313082h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.f313083j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.k);
        if (this.k) {
            this.f313084l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313085m);
        if (this.f313085m) {
            this.f313086n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            this.f313087p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313088q);
        if (this.f313088q) {
            this.f313089r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313090s);
        if (this.f313090s) {
            this.f313091t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313092w);
        if (this.f313092w) {
            this.f313093x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f313094y);
        if (this.f313094y) {
            this.z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.I);
        objectOutput.writeInt(this.J);
        objectOutput.writeUTF(this.K);
        objectOutput.writeBoolean(this.L);
        if (this.L) {
            objectOutput.writeUTF(this.M);
        }
        objectOutput.writeBoolean(this.N);
        if (this.N) {
            objectOutput.writeUTF(this.O);
        }
        objectOutput.writeBoolean(this.P);
        if (this.P) {
            objectOutput.writeUTF(this.Q);
        }
        objectOutput.writeBoolean(this.R);
        if (this.R) {
            objectOutput.writeUTF(this.S);
        }
        objectOutput.writeBoolean(this.T);
        if (this.T) {
            objectOutput.writeUTF(this.U);
        }
        objectOutput.writeBoolean(this.V);
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((i) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.X;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((i) arrayList2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Y);
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.f313077a0);
        }
        objectOutput.writeBoolean(this.f313079b0);
    }

    public final boolean x() {
        return this.P;
    }

    public void y(String str) {
        this.I = str;
    }
}
