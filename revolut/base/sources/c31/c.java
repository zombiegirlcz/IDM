package c31;

import com.revolut.data.database.models.statement.StatementTemplateInfoEntity;
import com.revolut.domain.models.statement.StatementTemplateId;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StatementTemplateId f20859c;

    public /* synthetic */ c(e eVar, StatementTemplateId statementTemplateId, int i) {
        this.f20857a = i;
        this.f20858b = eVar;
        this.f20859c = statementTemplateId;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20857a) {
            case 0:
                StatementTemplateInfoEntity byId = this.f20858b.f20861b.getById(p11.a.a(this.f20859c), null);
                if (byId != null) {
                    return p11.a.b(byId);
                }
                return null;
            default:
                return Boolean.valueOf(((String) this.f20858b.f20862c.T2("statement_template_".concat(p11.a.a(this.f20859c)), l21.d.d)) != null);
        }
    }
}
