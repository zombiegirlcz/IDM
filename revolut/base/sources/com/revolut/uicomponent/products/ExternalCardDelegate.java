package com.revolut.uicomponent.products;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.card.ExternalCardView;
import efm.r;
import gzl.e;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mfm.f;
import te0.w;
import tsk.t;
import ux7.g;
import uyl.l;
import uyl.m;
import uyl.n;
import uyl.o;
import v60.i;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0003¨\u0006\u0007"}, d2 = {"Lcom/revolut/uicomponent/products/ExternalCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/uicomponent/products/ExternalCardDelegate$a;", "Luyl/m;", "uyl/l", "b", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ExternalCardDelegate extends BaseRecyclerViewDelegate<a, m> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107175c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f107176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f107177h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f107178j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f107179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f107180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ifm.c f107181n;

    public static final class a implements j, o31.c {
        public final boolean A;
        public p31.c B;
        public p31.c C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f107184c;
        public final String d;
        public final e e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f107185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f107186h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f107187j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f107188l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f107189m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f107190n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f107191p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f107192q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f107193r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f107194s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f107195t;
        public final Integer u;
        public final boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f107196w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final String f107197x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final l f107198y;
        public final int z;

        public a() {
            this(null, null, null, null, null, null, 0, -1);
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF52342a() {
            return this.f107182a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f107182a, aVar.f107182a) && Intrinsics.f(this.f107183b, aVar.f107183b) && this.f107184c == aVar.f107184c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f107185g, aVar.f107185g) && Intrinsics.f(this.f107186h, aVar.f107186h) && Intrinsics.f(this.i, aVar.i) && this.f107187j == aVar.f107187j && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f107188l, aVar.f107188l) && this.f107189m == aVar.f107189m && Intrinsics.f(this.f107190n, aVar.f107190n) && Intrinsics.f(this.o, aVar.o) && this.f107191p == aVar.f107191p && Intrinsics.f(this.f107192q, aVar.f107192q) && Intrinsics.f(this.f107193r, aVar.f107193r) && Intrinsics.f(this.f107194s, aVar.f107194s) && this.f107195t == aVar.f107195t && Intrinsics.f(this.u, aVar.u) && this.v == aVar.v && this.f107196w == aVar.f107196w && Intrinsics.f(this.f107197x, aVar.f107197x) && this.f107198y == aVar.f107198y && this.z == aVar.z && this.A == aVar.A && Intrinsics.f(this.B, aVar.B) && Intrinsics.f(this.C, aVar.C);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() + j6.a.c(p.a.c(this.f107182a.hashCode() * 31, 31, this.f107183b), 31, this.f107184c);
            this.e.getClass();
            int iC = p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(iHashCode * 961, 31, this.f), 31, this.f107185g), 31, this.f107186h), 31, this.i), 31, false), 31, this.f107187j), 31, this.k);
            Boolean bool = this.f107188l;
            int iC2 = j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(p.a.c(p.a.c(j6.a.c(j6.a.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f107189m), 31, false), 31, this.f107190n), 31, this.o), 31, this.f107191p), 31, this.f107192q), 31, this.f107193r), 31, this.f107194s), 31, false), 31, this.f107195t), 31, false);
            Integer num = this.u;
            int iC3 = j6.a.c(j6.a.b(this.z, (this.f107198y.hashCode() + j6.a.c(p.a.c(j6.a.c(j6.a.c((iC2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.v), 31, this.f107196w), 31, this.f107197x), 31, false)) * 31, 31), 31, this.A);
            p31.c cVar = this.B;
            int iHashCode2 = (iC3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.C;
            return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i */
        public final p31.c getF52350n() {
            return this.B;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k */
        public final p31.c getO() {
            return this.C;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q */
        public final p31.c getF52352q() {
            return null;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r */
        public final p31.c getF52351p() {
            return null;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.B = cVar;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.C = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            a aVar = oldItem instanceof a ? (a) oldItem : null;
            if (aVar == null) {
                return null;
            }
            boolean z = aVar.f107184c;
            boolean z3 = this.f107184c;
            Boolean boolValueOf = z != z3 ? Boolean.valueOf(z3) : null;
            Integer num = aVar.u;
            Integer num2 = this.u;
            Integer num3 = !Intrinsics.f(num, num2) ? num2 : null;
            String str = aVar.d;
            String str2 = this.d;
            String str3 = !Intrinsics.f(str, str2) ? str2 : null;
            String str4 = aVar.f;
            String str5 = this.f;
            String str6 = !Intrinsics.f(str4, str5) ? str5 : null;
            String str7 = aVar.f107185g;
            String str8 = this.f107185g;
            String str9 = !Intrinsics.f(str7, str8) ? str8 : null;
            String str10 = aVar.f107186h;
            String str11 = this.f107186h;
            String str12 = !Intrinsics.f(str10, str11) ? str11 : null;
            boolean z4 = aVar.f107187j;
            boolean z6 = this.f107187j;
            Boolean boolValueOf2 = z4 != z6 ? Boolean.valueOf(z6) : null;
            String str13 = aVar.i;
            String str14 = this.i;
            String str15 = !Intrinsics.f(str13, str14) ? str14 : null;
            String str16 = aVar.f107190n;
            String str17 = this.f107190n;
            String str18 = !Intrinsics.f(str16, str17) ? str17 : null;
            String str19 = aVar.o;
            String str20 = this.o;
            String str21 = !Intrinsics.f(str19, str20) ? str20 : null;
            boolean z11 = aVar.f107191p;
            boolean z12 = this.f107191p;
            Boolean boolValueOf3 = z11 != z12 ? Boolean.valueOf(z12) : null;
            String str22 = aVar.f107193r;
            String str23 = this.f107193r;
            String str24 = !Intrinsics.f(str22, str23) ? str23 : null;
            String str25 = aVar.f107194s;
            String str26 = this.f107194s;
            String str27 = !Intrinsics.f(str25, str26) ? str26 : null;
            boolean z29 = aVar.f107195t;
            boolean z31 = this.f107195t;
            Boolean boolValueOf4 = z29 != z31 ? Boolean.valueOf(z31) : null;
            boolean z41 = aVar.v;
            boolean z49 = this.v;
            Boolean boolValueOf5 = z41 != z49 ? Boolean.valueOf(z49) : null;
            boolean z54 = aVar.f107196w;
            boolean z74 = this.f107196w;
            Boolean boolValueOf6 = z54 != z74 ? Boolean.valueOf(z74) : null;
            int i = aVar.z;
            int i2 = this.z;
            Integer numValueOf = i != i2 ? Integer.valueOf(i2) : null;
            Boolean bool = !Intrinsics.f(aVar.f107197x, this.f107197x) ? Boolean.TRUE : null;
            l lVar = aVar.f107198y;
            l lVar2 = this.f107198y;
            return new b(num3, str3, this.e, str6, str9, str12, str15, null, boolValueOf2, null, str21, str18, boolValueOf3, str24, str27, null, boolValueOf4, null, boolValueOf5, boolValueOf6, numValueOf, bool, lVar != lVar2 ? lVar2 : null, boolValueOf);
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
            Boolean bool = Boolean.TRUE;
            String listId = (i2 & 1) != 0 ? "" : str;
            String cardNumber = (i2 & 2) != 0 ? "" : str2;
            String cardNumberError = (i2 & 8) != 0 ? "" : str3;
            e.Companion.getClass();
            e cardNumberSoftError = new e();
            String cardNumberHint = (i2 & 32) != 0 ? "" : str4;
            String cardNumberFloatingHint = (i2 & 64) != 0 ? "" : str5;
            bool = (i2 & 4096) != 0 ? null : bool;
            boolean z = (131072 & i2) != 0;
            boolean z3 = (4194304 & i2) != 0;
            Integer num = (i2 & 16777216) != 0 ? null : 19;
            String cardInfoSource = (i2 & 134217728) != 0 ? "" : str6;
            l currentFocus = l.NONE;
            int i3 = (i2 & 1073741824) != 0 ? 0 : i;
            boolean z4 = (i2 & Integer.MIN_VALUE) == 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
            Intrinsics.checkNotNullParameter(cardNumberError, "cardNumberError");
            Intrinsics.checkNotNullParameter(cardNumberSoftError, "cardNumberSoftError");
            Intrinsics.checkNotNullParameter(cardNumberHint, "cardNumberHint");
            Intrinsics.checkNotNullParameter(cardNumberFloatingHint, "cardNumberFloatingHint");
            Intrinsics.checkNotNullParameter("", "postcodeHint");
            Intrinsics.checkNotNullParameter("", "postcode");
            Intrinsics.checkNotNullParameter("", "expireDate");
            Intrinsics.checkNotNullParameter("", "expireDateHint");
            Intrinsics.checkNotNullParameter("", "expireDateFloatingHint");
            Intrinsics.checkNotNullParameter("", "cvv");
            Intrinsics.checkNotNullParameter("", "cvvHint");
            Intrinsics.checkNotNullParameter("", "cvvFloatingHint");
            Intrinsics.checkNotNullParameter(cardInfoSource, "cardInfoSource");
            Intrinsics.checkNotNullParameter(currentFocus, "currentFocus");
            this.f107182a = listId;
            this.f107183b = cardNumber;
            this.f107184c = true;
            this.d = cardNumberError;
            this.e = cardNumberSoftError;
            this.f = cardNumberHint;
            this.f107185g = cardNumberFloatingHint;
            this.f107186h = "";
            this.i = "";
            this.f107187j = false;
            this.k = "";
            this.f107188l = bool;
            this.f107189m = true;
            this.f107190n = "";
            this.o = "";
            this.f107191p = z;
            this.f107192q = "";
            this.f107193r = "";
            this.f107194s = "";
            this.f107195t = z3;
            this.u = num;
            this.v = false;
            this.f107196w = false;
            this.f107197x = cardInfoSource;
            this.f107198y = currentFocus;
            this.z = i3;
            this.A = z4;
            this.B = null;
            this.C = null;
        }
    }

    public ExternalCardDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new m(s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(m holder, a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ExternalCardView externalCardView = holder.f;
        if (payloads.isEmpty()) {
            Boolean bool = data.f107188l;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    bool = null;
                }
                if (bool != null) {
                    externalCardView.setCurrentFocusCard();
                }
            }
            externalCardView.setBrandIconCallback(null);
            externalCardView.setListener(new d(this, data));
            externalCardView.setCardNumberLength(data.u);
            externalCardView.setCardNumber(data.f107183b);
            externalCardView.setCardNumberHint(data.f);
            externalCardView.setCardNumberFloatingHint(data.f107185g);
            externalCardView.setCardNumberError(data.d);
            externalCardView.setCardNumberSoftError(data.e);
            externalCardView.setCardNumberEditable(data.f107184c);
            externalCardView.setPostcodeHint(data.f107186h);
            externalCardView.setPostcode(data.i);
            externalCardView.setPostcodeVisible(data.f107187j);
            externalCardView.setExpireDateError(false);
            externalCardView.setExpireDateFloatingHint(data.o);
            externalCardView.setExpireDateHint(data.f107190n);
            externalCardView.setExpireDate(data.k);
            externalCardView.setExpiryDateVisible(data.f107191p);
            externalCardView.setCvv(data.f107192q);
            externalCardView.setCvvHint(data.f107193r);
            externalCardView.setCvvFloatingHint(data.f107194s);
            externalCardView.setCvvError(false);
            externalCardView.setCvvVisible(data.f107195t);
            externalCardView.setShowCameraIcon(data.v);
            externalCardView.setShowNfcIcon(data.f107196w);
            externalCardView.setBrandIcon(data.z);
            int i2 = n.f284470a[data.f107198y.ordinal()];
            if (i2 == 1) {
                externalCardView.setCurrentFocusCard();
            } else if (i2 == 2) {
                externalCardView.setCurrentExpiryDate();
            } else if (i2 == 3) {
                externalCardView.setCurrentFocusCvv(false);
            } else if (i2 == 4) {
                externalCardView.setCurrentFocusPostcode();
            } else if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            this.f107181n.dispose();
            i iVar = (i) this.f107180m.getValue();
            Intrinsics.checkNotNullExpressionValue(iVar, "<get-keyboardSubject>(...)");
            uu9.b bVar = new uu9.b(holder, 14);
            r rVarOnErrorResumeNext = iVar.onErrorResumeNext(new t(new up5.s(new BreadcrumbException(), 17)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(21, bVar), new o9h.d(21, o.f284471a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
            this.f107181n = cVarSubscribe;
            return;
        }
        for (Object obj2 : payloads) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.uicomponent.products.ExternalCardDelegate.Payload");
            b bVar2 = (b) obj2;
            Integer num = bVar2.f107199a;
            if (num != null) {
                externalCardView.setCardNumberLength(Integer.valueOf(num.intValue()));
            }
            String str = bVar2.f107200b;
            if (str != null) {
                externalCardView.setCardNumberError(str);
            }
            externalCardView.setCardNumberSoftError(bVar2.f107201c);
            String str2 = bVar2.d;
            if (str2 != null) {
                externalCardView.setCardNumberHint(str2);
            }
            String str3 = bVar2.e;
            if (str3 != null) {
                externalCardView.setCardNumberFloatingHint(str3);
            }
            String str4 = bVar2.f;
            if (str4 != null) {
                externalCardView.setPostcodeHint(str4);
            }
            Boolean bool2 = bVar2.i;
            if (bool2 != null) {
                externalCardView.setPostcodeVisible(bool2.booleanValue());
            }
            String str5 = bVar2.f107202g;
            if (str5 != null) {
                externalCardView.setPostcode(str5);
            }
            Boolean bool3 = bVar2.f107203h;
            if (bool3 != null) {
                externalCardView.setPostcodeError(bool3.booleanValue());
            }
            Boolean bool4 = bVar2.f107204j;
            if (bool4 != null) {
                externalCardView.setExpireDateError(bool4.booleanValue());
            }
            String str6 = bVar2.k;
            if (str6 != null) {
                externalCardView.setExpireDateFloatingHint(str6);
            }
            String str7 = bVar2.f107205l;
            if (str7 != null) {
                externalCardView.setExpireDateHint(str7);
            }
            Boolean bool5 = bVar2.f107206m;
            if (bool5 != null) {
                externalCardView.setExpiryDateVisible(bool5.booleanValue());
            }
            String str8 = bVar2.f107207n;
            if (str8 != null) {
                externalCardView.setCvvHint(str8);
            }
            String str9 = bVar2.o;
            if (str9 != null) {
                externalCardView.setCvvFloatingHint(str9);
            }
            Boolean bool6 = bVar2.f107209q;
            if (bool6 != null) {
                externalCardView.setCvvVisible(bool6.booleanValue());
            }
            Boolean bool7 = bVar2.f107208p;
            if (bool7 != null) {
                externalCardView.setCvvError(bool7.booleanValue());
            }
            Boolean bool8 = bVar2.f107211s;
            if (bool8 != null) {
                externalCardView.setShowCameraIcon(bool8.booleanValue());
            }
            Boolean bool9 = bVar2.f107212t;
            if (bool9 != null) {
                externalCardView.setShowNfcIcon(bool9.booleanValue());
            }
            Integer num2 = bVar2.u;
            if (num2 != null) {
                externalCardView.setBrandIcon(num2.intValue());
            }
            Boolean bool10 = bVar2.f107214x;
            if (bool10 != null) {
                externalCardView.setCardNumberEditable(bool10.booleanValue());
            }
            l lVar = bVar2.f107213w;
            if (lVar != null) {
                int i3 = n.f284470a[lVar.ordinal()];
                if (i3 == 1) {
                    externalCardView.setCurrentFocusCard();
                } else if (i3 == 2) {
                    externalCardView.setCurrentExpiryDate();
                } else if (i3 == 3) {
                    Boolean bool11 = bVar2.f107210r;
                    externalCardView.setCurrentFocusCvv(bool11 != null ? bool11.booleanValue() : false);
                } else if (i3 == 4) {
                    externalCardView.setCurrentFocusPostcode();
                } else if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Boolean bool12 = bVar2.v;
            if (bool12 != null && bool12.booleanValue()) {
                externalCardView.setCardNumberLength(data.u);
                externalCardView.setCardNumber(data.f107183b);
                externalCardView.setExpireDate(data.k);
                externalCardView.setCvv(data.f107192q);
            }
        }
    }

    public ExternalCardDelegate(int i) {
        super(R$layout.delegate_external_card, new uyh.s(4));
        this.f107175c = w.y0(new g(9));
        this.d = w.y0(new g(10));
        this.e = w.y0(new g(11));
        this.f = w.y0(new g(12));
        this.f107176g = w.y0(new g(13));
        this.f107177h = w.y0(new g(14));
        this.i = w.y0(new g(4));
        this.f107178j = w.y0(new g(5));
        this.k = w.y0(new g(6));
        this.f107179l = w.y0(new g(7));
        this.f107180m = w.y0(new g(8));
        ifm.a aVar = new ifm.a(f.f205042b, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "empty(...)");
        this.f107181n = aVar;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f107199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f107201c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f107202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f107203h;
        public final Boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Boolean f107204j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f107205l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Boolean f107206m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f107207n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Boolean f107208p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Boolean f107209q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Boolean f107210r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Boolean f107211s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Boolean f107212t;
        public final Integer u;
        public final Boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final l f107213w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Boolean f107214x;

        public b(Integer num, String str, e cardNumberSoftError, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, String str7, Boolean bool4, String str8, String str9, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num2, Boolean bool10, l lVar, Boolean bool11) {
            Intrinsics.checkNotNullParameter(cardNumberSoftError, "cardNumberSoftError");
            this.f107199a = num;
            this.f107200b = str;
            this.f107201c = cardNumberSoftError;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.f107202g = str5;
            this.f107203h = bool;
            this.i = bool2;
            this.f107204j = bool3;
            this.k = str6;
            this.f107205l = str7;
            this.f107206m = bool4;
            this.f107207n = str8;
            this.o = str9;
            this.f107208p = bool5;
            this.f107209q = bool6;
            this.f107210r = bool7;
            this.f107211s = bool8;
            this.f107212t = bool9;
            this.u = num2;
            this.v = bool10;
            this.f107213w = lVar;
            this.f107214x = bool11;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f107199a, bVar.f107199a) && Intrinsics.f(this.f107200b, bVar.f107200b) && Intrinsics.f(this.f107201c, bVar.f107201c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f107202g, bVar.f107202g) && Intrinsics.f(this.f107203h, bVar.f107203h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f107204j, bVar.f107204j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f107205l, bVar.f107205l) && Intrinsics.f(this.f107206m, bVar.f107206m) && Intrinsics.f(this.f107207n, bVar.f107207n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f107208p, bVar.f107208p) && Intrinsics.f(this.f107209q, bVar.f107209q) && Intrinsics.f(this.f107210r, bVar.f107210r) && Intrinsics.f(this.f107211s, bVar.f107211s) && Intrinsics.f(this.f107212t, bVar.f107212t) && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v) && this.f107213w == bVar.f107213w && Intrinsics.f(this.f107214x, bVar.f107214x);
        }

        public final int hashCode() {
            Integer num = this.f107199a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f107200b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            this.f107201c.getClass();
            int i = iHashCode2 * 961;
            String str2 = this.d;
            int iHashCode3 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f107202g;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.f107203h;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.i;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f107204j;
            int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str6 = this.k;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f107205l;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool4 = this.f107206m;
            int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str8 = this.f107207n;
            int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.o;
            int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool5 = this.f107208p;
            int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f107209q;
            int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.f107210r;
            int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.f107211s;
            int iHashCode18 = (iHashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.f107212t;
            int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Integer num2 = this.u;
            int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool10 = this.v;
            int iC = j6.a.c((iHashCode20 + (bool10 == null ? 0 : bool10.hashCode())) * 31, 31, false);
            l lVar = this.f107213w;
            int iHashCode21 = (iC + (lVar == null ? 0 : lVar.hashCode())) * 31;
            Boolean bool11 = this.f107214x;
            return iHashCode21 + (bool11 != null ? bool11.hashCode() : 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b() {
            this(null, null, new e(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            e.Companion.getClass();
        }
    }
}
