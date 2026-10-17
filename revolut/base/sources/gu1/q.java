package gu1;

import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import java.text.Collator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f146679b;

    public q() {
        this.f146678a = 2;
        this.f146679b = String.CASE_INSENSITIVE_ORDER;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f146678a) {
            case 0:
                return this.f146679b.compare(((BlikContact) obj2).getDisplayName(), ((BlikContact) obj3).getDisplayName());
            case 1:
                return this.f146679b.compare(((QvikContact) obj2).getDisplayName(), ((QvikContact) obj3).getDisplayName());
            case 2:
                return this.f146679b.compare(n61.j.c((f5j.a) obj2), n61.j.c((f5j.a) obj3));
            case 3:
                return this.f146679b.compare(((MultibancoContact) obj2).getDisplayName(), ((MultibancoContact) obj3).getDisplayName());
            case 4:
                return this.f146679b.compare(((PixContact) obj2).getDisplayName(), ((PixContact) obj3).getDisplayName());
            case 5:
                return this.f146679b.compare(hx7.q.v((zm3.f) obj2), hx7.q.v((zm3.f) obj3));
            case 6:
                return this.f146679b.compare(hx7.q.v((zm3.f) obj2), hx7.q.v((zm3.f) obj3));
            case 7:
                return this.f146679b.compare(((BizumContact) obj2).getDisplayName(), ((BizumContact) obj3).getDisplayName());
            case 8:
                return this.f146679b.compare(((WeroContact) obj2).getDisplayName(), ((WeroContact) obj3).getDisplayName());
            case 9:
                return this.f146679b.compare(((BrebContact) obj2).getDisplayName(), ((BrebContact) obj3).getDisplayName());
            default:
                return this.f146679b.compare(hx7.q.v((zm3.f) obj2), hx7.q.v((zm3.f) obj3));
        }
    }

    public /* synthetic */ q(Collator collator, int i) {
        this.f146678a = i;
        this.f146679b = collator;
    }
}
