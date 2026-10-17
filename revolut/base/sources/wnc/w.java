package wnc;

import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreenContract$UIState$SelectedTab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f298815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TemplatesScreenContract$UIState$SelectedTab f298816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f298817c;
    public final List d;
    public final d8f.s e;

    public w(s sVar, TemplatesScreenContract$UIState$SelectedTab templatesScreenContract$UIState$SelectedTab, List list, List list2, d8f.s nextButtonState) {
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        this.f298815a = sVar;
        this.f298816b = templatesScreenContract$UIState$SelectedTab;
        this.f298817c = list;
        this.d = list2;
        this.e = nextButtonState;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof w) {
            return new v(!Intrinsics.f(((w) oldState).f298816b, this.f298816b));
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f298815a, wVar.f298815a) && Intrinsics.f(this.f298816b, wVar.f298816b) && Intrinsics.f(this.f298817c, wVar.f298817c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e);
    }

    public final int hashCode() {
        s sVar = this.f298815a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        TemplatesScreenContract$UIState$SelectedTab templatesScreenContract$UIState$SelectedTab = this.f298816b;
        int iHashCode2 = (iHashCode + (templatesScreenContract$UIState$SelectedTab == null ? 0 : templatesScreenContract$UIState$SelectedTab.hashCode())) * 31;
        List list = this.f298817c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }
}
