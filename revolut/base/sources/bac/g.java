package bac;

import b6b.m;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import java.util.Set;
import p12.f0;
import p7c.r;
import p7c.x;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14032a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShippingContactsScreenDescriptor$InputData f14033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f14034c;
    public final e4m.e d;
    public final e4m.e e;

    public g(b bVar, c cVar, ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData) {
        this.f14033b = shippingContactsScreenDescriptor$InputData;
        int i = 18;
        this.f14034c = e4m.b.b(new m(bVar, this, 1, i));
        this.d = e4m.b.b(new m(bVar, this, 0, i));
        this.e = e4m.b.b(new m(bVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f14032a) {
        }
        return ImmutableSet.of((n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f14032a) {
        }
        return ImmutableSet.of();
    }

    public g(r rVar, x xVar, ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData) {
        this.f14033b = shippingContactsScreenDescriptor$InputData;
        int i = 24;
        this.f14034c = e4m.b.b(new f0(rVar, this, 1, i));
        this.d = e4m.b.b(new f0(rVar, this, 0, i));
        this.e = e4m.b.b(new f0(rVar, this, 2, i));
    }

    public g(r rVar, ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData) {
        this.f14033b = shippingContactsScreenDescriptor$InputData;
        int i = 25;
        this.f14034c = e4m.b.b(new f0(rVar, this, 1, i));
        this.d = e4m.b.b(new f0(rVar, this, 0, i));
        this.e = e4m.b.b(new f0(rVar, this, 2, i));
    }
}
