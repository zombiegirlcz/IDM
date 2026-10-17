package bn2;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ e0 E;
    public int F;
    public ThemeCustomisationSandboxInteractorImpl$SandboxState u;
    public GlobalThemeDeclaration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f17050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f17051x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public BackgroundKey f17052y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.E = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.S(null, this);
    }
}
