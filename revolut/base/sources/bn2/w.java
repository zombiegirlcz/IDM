package bn2;

import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e0 B;
    public int C;
    public ThemeCustomisationSandboxInteractorImpl$SandboxState u;
    public GlobalThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public xjg.m f17044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xjg.j f17045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f17046y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.B = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.R(this);
    }
}
