package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class w3 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176423a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardDescriptionScreenContract$InputData f176424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f176425c;
    public final e4m.e d;
    public final e4m.e e;

    public w3(a3 a3Var, CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData) {
        this.f176425c = a3Var;
        this.f176424b = creditCardDescriptionScreenContract$InputData;
        int i = 0;
        this.d = e4m.b.b(new z3(a3Var, this, 1, i));
        this.e = e4m.b.b(new z3(a3Var, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f176423a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f176423a) {
        }
        return ImmutableSet.of();
    }

    public w3(a3 a3Var, k0 k0Var, CreditCardDescriptionScreenContract$InputData creditCardDescriptionScreenContract$InputData) {
        this.f176425c = a3Var;
        this.f176424b = creditCardDescriptionScreenContract$InputData;
        int i = 29;
        this.d = e4m.b.b(new f1(a3Var, this, 1, i));
        this.e = e4m.b.b(new f1(a3Var, this, 0, i));
    }
}
