package lpf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199064a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInformationInputData f199065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199066c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199068h;
    public final e4m.e i;

    public n(i iVar, b bVar, BaseScreen baseScreen, AdditionalInformationInputData additionalInformationInputData) {
        this.f199065b = additionalInformationInputData;
        this.f199066c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 6;
        this.d = e4m.b.b(new ljl.y(this, 1, i));
        this.e = e4m.b.b(new ljl.y(this, 0, i));
        this.f = e4m.b.b(new ljl.y(this, 3, i));
        this.f199067g = e4m.b.b(new ljl.y(this, 2, i));
        this.f199068h = e4m.b.b(new ljl.y(this, 5, i));
        this.i = e4m.b.b(new ljl.y(this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f199064a) {
        }
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f199064a) {
        }
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f199067g.get());
    }

    public n(i iVar, BaseScreen baseScreen, AdditionalInformationInputData additionalInformationInputData) {
        this.f199065b = additionalInformationInputData;
        this.f199066c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 7;
        this.d = e4m.b.b(new ljl.y(this, 1, i));
        this.e = e4m.b.b(new ljl.y(this, 0, i));
        this.f = e4m.b.b(new ljl.y(this, 3, i));
        this.f199067g = e4m.b.b(new ljl.y(this, 2, i));
        this.f199068h = e4m.b.b(new ljl.y(this, 5, i));
        this.i = e4m.b.b(new ljl.y(this, 4, i));
    }
}
