package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import ip0.iy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class p9 {
    public static final iy a(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.e;
        }
        return null;
    }

    public static final iy b(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.f54433g;
        }
        return null;
    }

    public static final Clause c(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.f54430a;
        }
        return null;
    }

    public static final Clause d(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.f54432c;
        }
        return null;
    }

    public static final iy e(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.d;
        }
        return null;
    }

    public static final iy f(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.f;
        }
        return null;
    }

    public static final mx0.ua g(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        if (n9Var instanceof l9) {
            return ((l9) n9Var).f54434h ? mx0.ua.Body3 : mx0.ua.Emphasis1;
        }
        if (Intrinsics.f(n9Var, m9.f54462a)) {
            return mx0.ua.Emphasis1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String h(NewRevolutCardDelegate.Model model) {
        n9 n9Var = model.f52809b;
        l9 l9Var = n9Var instanceof l9 ? (l9) n9Var : null;
        if (l9Var != null) {
            return l9Var.f54431b;
        }
        return null;
    }
}
