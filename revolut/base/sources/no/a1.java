package no;

import android.app.Dialog;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f217725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Dialog f217726c;

    public a1(String str, View view, Dialog dialog) {
        this.f217724a = str;
        this.f217725b = view;
        this.f217726c = dialog;
    }

    public final String a() {
        return this.f217724a;
    }

    public final View b() {
        return this.f217725b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!a1.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.analytics.tracking.v3.DialogViewScreen.DialogDescriptor");
        return Intrinsics.f(this.f217724a, ((a1) obj2).f217724a);
    }

    public final int hashCode() {
        return this.f217724a.hashCode();
    }

    public final String toString() {
        return this.f217724a;
    }
}
