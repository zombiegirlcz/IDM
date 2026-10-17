package by9;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.payments.recipients.settings.models.RecipientsPaymentsSettingsRequest$Recipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f19787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f19788x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Set set, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f19787w = set;
        this.f19788x = setting;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f19787w, this.f19788x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object next;
        RecipientPaymentsSettings.Setting setting;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            brc.h hVar = new brc.h(jVar, continuation, 18);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, hVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        List list = (List) obj2;
        Set set = this.f19787w;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (true) {
            int i2 = -1;
            int i3 = 0;
            if (!it8.hasNext()) {
                break;
            }
            RecipientsPaymentsSettingsRequest$Recipient recipientsPaymentsSettingsRequest$Recipient = (RecipientsPaymentsSettingsRequest$Recipient) it8.next();
            String str = recipientsPaymentsSettingsRequest$Recipient.f79679a;
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((RecipientPaymentsSettings) next).f79672a, str)) {
                    break;
                }
            }
            RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) next;
            if (recipientPaymentsSettings == null) {
                recipientPaymentsSettings = new RecipientPaymentsSettings(recipientsPaymentsSettingsRequest$Recipient.f79679a, recipientsPaymentsSettingsRequest$Recipient.f79680b, f0.f322471a);
            }
            List list2 = recipientPaymentsSettings.f79674c;
            int size = list2.size();
            ArrayList settings = d0.f1(list2);
            Iterator it10 = settings.iterator();
            while (true) {
                boolean zHasNext = it10.hasNext();
                setting = this.f19788x;
                if (!zHasNext) {
                    break;
                }
                if (((RecipientPaymentsSettings.Setting) it10.next()).f79675a == setting.f79675a) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0) {
                settings.set(i2, setting);
            } else {
                settings.add(size, setting);
            }
            String id10 = recipientPaymentsSettings.f79672a;
            iy9.d type = recipientPaymentsSettings.f79673b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(settings, "settings");
            arrayList.add(new RecipientPaymentsSettings(id10, type, settings));
        }
        ArrayList arrayListF1 = d0.f1(list);
        for (Object obj3 : arrayList) {
            Iterator it11 = arrayListF1.iterator();
            int i5 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (Intrinsics.f(((RecipientPaymentsSettings) it11.next()).f79672a, ((RecipientPaymentsSettings) obj3).f79672a)) {
                    break;
                }
                i5++;
            }
            if (i5 >= 0) {
                arrayListF1.set(i5, obj3);
            } else {
                arrayListF1.add(obj3);
            }
        }
        w4l.f fVar = jVar.d;
        Unit unit = Unit.f186387a;
        fVar.j(unit, arrayListF1);
        return unit;
    }
}
