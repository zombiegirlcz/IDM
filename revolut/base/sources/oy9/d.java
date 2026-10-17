package oy9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import h93.f0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import x5k.s;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends atc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f230917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f01.a aVar, int i) {
        super(aVar);
        this.f230917b = i;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        switch (this.f230917b) {
            case 0:
                s instance = (s) obj2;
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                targetCollection.add(b(instance.f303000a));
                Clause clause = instance.f303001b;
                if (clause != null) {
                    targetCollection.add(b(clause));
                }
                Iterator it8 = instance.d.iterator();
                while (it8.hasNext()) {
                    targetCollection.add(b((Clause) it8.next()));
                }
                break;
            case 1:
                p97.a instance2 = (p97.a) obj2;
                Intrinsics.checkNotNullParameter(instance2, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                Iterator it9 = instance2.f.iterator();
                while (it9.hasNext()) {
                    targetCollection.add(b((Clause) it9.next()));
                }
                break;
            case 2:
                p97.a instance3 = (p97.a) obj2;
                Intrinsics.checkNotNullParameter(instance3, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                targetCollection.add(b(instance3.f234282c));
                break;
            default:
                f0 instance4 = (f0) obj2;
                Intrinsics.checkNotNullParameter(instance4, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                String str = instance4.f150111b;
                if (str != null) {
                    targetCollection.add(str);
                }
                String str2 = instance4.f150115j;
                if (str2 != null) {
                    targetCollection.add(str2);
                }
                if (instance4.e) {
                    targetCollection.add(b(new TextLocalisedClause(R$string.card_revolut_pay_title, null, null, 14)));
                }
                break;
        }
    }
}
