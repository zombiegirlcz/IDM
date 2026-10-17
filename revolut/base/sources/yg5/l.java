package yg5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.spinnerPicker.c f313530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f313531c;

    public l(List items, com.revolut.core.ui_kit.views.spinnerPicker.c spinnerPickerModel, aw0.e actionFooter) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(spinnerPickerModel, "spinnerPickerModel");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f313529a = items;
        this.f313530b = spinnerPickerModel;
        this.f313531c = actionFooter;
    }

    @Override // cli.p
    public final List c() {
        return this.f313529a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f313529a, lVar.f313529a) && Intrinsics.f(this.f313530b, lVar.f313530b) && this.f313531c.equals(lVar.f313531c);
    }

    public final int hashCode() {
        return this.f313531c.hashCode() + ((this.f313530b.hashCode() + (this.f313529a.hashCode() * 31)) * 31);
    }
}
