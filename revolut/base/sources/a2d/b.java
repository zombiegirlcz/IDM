package a2d;

import com.google.common.collect.ImmutableMap;
import kl.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f733b;

    public /* synthetic */ b(int i, int i2) {
        this.f732a = i2;
        this.f733b = i;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f732a) {
            case 0:
                int i = this.f733b;
                if (i == 0) {
                    return new h2d.c();
                }
                if (i == 1) {
                    return new h2d.a();
                }
                if (i == 2) {
                    return new h2d.b();
                }
                if (i == 3) {
                    return new h2d.e();
                }
                throw new AssertionError(i);
            case 1:
                int i2 = this.f733b;
                if (i2 == 0) {
                    return new uli.g();
                }
                if (i2 == 1) {
                    return new uli.f();
                }
                throw new AssertionError(i2);
            case 2:
                int i3 = this.f733b;
                if (i3 == 0) {
                    return bxc.f.a();
                }
                if (i3 == 1) {
                    return new dxc.a();
                }
                throw new AssertionError(i3);
            case 3:
                int i5 = this.f733b;
                if (i5 == 0) {
                    return new eb1.a();
                }
                if (i5 == 1) {
                    return new cb1.a();
                }
                throw new AssertionError(i5);
            case 4:
                int i6 = this.f733b;
                if (i6 == 0) {
                    return new cbj.b(new ri5.a());
                }
                if (i6 == 1) {
                    return new cbj.a();
                }
                throw new AssertionError(i6);
            case 5:
                int i21 = this.f733b;
                if (i21 == 0) {
                    return fp9.c.a();
                }
                if (i21 == 1) {
                    return fp9.d.a();
                }
                if (i21 == 2) {
                    return new hp9.c();
                }
                throw new AssertionError(i21);
            case 6:
                int i22 = this.f733b;
                if (i22 == 0) {
                    return new lrh.a(fe0.c.a());
                }
                if (i22 == 1) {
                    return new irh.a();
                }
                if (i22 == 2) {
                    return new mrh.a();
                }
                throw new AssertionError(i22);
            case 7:
                int i32 = this.f733b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        return new qn5.b(on5.a.a());
                    }
                    throw new AssertionError(i32);
                }
                rn5.b bVar = new rn5.b();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(16);
                builderBuilderWithExpectedSize.put("BITCOINCASH", new un5.b(new un5.c()));
                builderBuilderWithExpectedSize.put("BITCOIN", new tn5.b(new tn5.e(on5.a.a()), new tn5.c()));
                builderBuilderWithExpectedSize.put("RIPPLE", new ao5.b(on5.a.a()));
                builderBuilderWithExpectedSize.put("ETHEREUM", new xn5.a(new xn5.b()));
                builderBuilderWithExpectedSize.put("AVALANCHE", new xn5.a(new xn5.b()));
                builderBuilderWithExpectedSize.put("ARBITRUM", new xn5.a(new xn5.b()));
                builderBuilderWithExpectedSize.put("ALGORAND", new sn5.a());
                builderBuilderWithExpectedSize.put("TEZOS", new do5.b(on5.a.a()));
                builderBuilderWithExpectedSize.put("LITECOIN", new yn5.b(new tn5.e(on5.a.a()), new tn5.c()));
                builderBuilderWithExpectedSize.put("DOGECOIN", new wn5.b(new tn5.e(on5.a.a())));
                builderBuilderWithExpectedSize.put("STELLAR", new co5.b(new c0(new mn5.c()), new ln5.b()));
                builderBuilderWithExpectedSize.put("CARDANO", new vn5.d(on5.a.a(), new ln5.c(), new vn5.e()));
                builderBuilderWithExpectedSize.put("POLKADOT", new zn5.c(on5.a.a()));
                builderBuilderWithExpectedSize.put("SOLANA", new bo5.b(on5.a.a()));
                builderBuilderWithExpectedSize.put("TON", new eo5.c());
                builderBuilderWithExpectedSize.put("TRON", new fo5.b(on5.a.a()));
                return new pn5.a(bVar, builderBuilderWithExpectedSize.build());
            case 8:
                int i33 = this.f733b;
                if (i33 == 0) {
                    return new t99.k();
                }
                if (i33 == 1) {
                    return new s99.e();
                }
                throw new AssertionError(i33);
            case 9:
                int i43 = this.f733b;
                if (i43 == 0) {
                    return new ifm.b();
                }
                if (i43 == 1) {
                    return new iri.j();
                }
                throw new AssertionError(i43);
            default:
                int i59 = this.f733b;
                if (i59 == 0) {
                    return new usi.a();
                }
                if (i59 == 1) {
                    return new wsi.a();
                }
                throw new AssertionError(i59);
        }
    }

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f732a = i2;
        this.f733b = i;
    }
}
