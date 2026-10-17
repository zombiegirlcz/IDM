package iv9;

import com.revolut.feature.payments.messaging.data.api.model.MessageAuthor;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageMetadata;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import dv9.t;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.serialization.json.Json;
import kv9.r;
import kv9.s;
import kv9.t;
import kv9.u;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f168791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kgm.i f168792b;

    public k(o gson, kgm.i messageMentionsParser) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(messageMentionsParser, "messageMentionsParser");
        this.f168791a = gson;
        this.f168792b = messageMentionsParser;
    }

    public static dv9.h b(kv9.h messageDto, String userCode) {
        t tVar;
        Intrinsics.checkNotNullParameter(messageDto, "messageDto");
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        s relatedEntityDto = messageDto.getRelatedEntityDto();
        if (relatedEntityDto == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String groupId = messageDto.getRecipient().getGroupId();
        int i = 0;
        boolean z = groupId == null || d0.W(groupId);
        boolean z3 = !z;
        String groupId2 = !z ? messageDto.getRecipient().getGroupId() : Intrinsics.f(messageDto.getRecipient().getCode(), userCode) ? messageDto.getSender().getCode() : messageDto.getRecipient().getCode();
        if (groupId2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String id10 = messageDto.getId();
        String key = relatedEntityDto.getKey();
        String type = relatedEntityDto.getType();
        t[] tVarArrValues = t.values();
        int length = tVarArrValues.length;
        while (true) {
            if (i >= length) {
                tVar = null;
                break;
            }
            tVar = tVarArrValues[i];
            if (a0.z(tVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (tVar == null) {
            tVar = t.UNKNOWN;
        }
        t tVar2 = tVar;
        String media = messageDto.getMedia();
        if (media == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        rlm.b bVar = Json.d;
        bVar.getClass();
        List<e> listA = ((h) bVar.b(h.Companion.serializer(), media)).a();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (e eVar : listA) {
            arrayList.add(new dv9.g(eVar.b(), eVar.c(), eVar.a()));
        }
        return new dv9.h(id10, key, tVar2, groupId2, z3, zhm.d0.P0(arrayList, new j()));
    }

    public static MessageType.PlanReferral c(kv9.o oVar) {
        com.revolut.feature.payments.messaging.data.api.model.a aVar;
        String id10 = oVar.getId();
        String state = oVar.getState();
        com.revolut.feature.payments.messaging.data.api.model.a[] aVarArrValues = com.revolut.feature.payments.messaging.data.api.model.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), state, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = com.revolut.feature.payments.messaging.data.api.model.a.UNKNOWN;
        }
        com.revolut.feature.payments.messaging.data.api.model.a aVar2 = aVar;
        String planTier = oVar.getPlanTier();
        Period period = Period.parse(oVar.getDiscountDuration());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        double discountPercentage = oVar.getDiscountPercentage();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(oVar.getPlanReferralEndDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new MessageType.PlanReferral(id10, aVar2, planTier, period, discountPercentage, instantOfEpochMilli, oVar.getAssetUri());
    }

    public static MessageType.PricingPlanGift d(kv9.b bVar) {
        com.revolut.feature.payments.messaging.data.api.model.c cVar;
        com.revolut.feature.payments.messaging.data.api.model.b bVar2;
        String id10 = bVar.getId();
        Period period = Period.parse(bVar.getPeriod());
        Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
        String tier = bVar.getTier();
        com.revolut.feature.payments.messaging.data.api.model.b[] bVarArrValues = com.revolut.feature.payments.messaging.data.api.model.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            cVar = null;
            if (i2 >= length) {
                bVar2 = null;
                break;
            }
            bVar2 = bVarArrValues[i2];
            if (a0.z(bVar2.name(), tier, true)) {
                break;
            }
            i2++;
        }
        if (bVar2 == null) {
            bVar2 = com.revolut.feature.payments.messaging.data.api.model.b.UNKNOWN;
        }
        com.revolut.feature.payments.messaging.data.api.model.b bVar3 = bVar2;
        String assetUri = bVar.getAssetUri();
        String state = bVar.getState();
        com.revolut.feature.payments.messaging.data.api.model.c[] cVarArrValues = com.revolut.feature.payments.messaging.data.api.model.c.values();
        int length2 = cVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            com.revolut.feature.payments.messaging.data.api.model.c cVar2 = cVarArrValues[i];
            if (a0.z(cVar2.name(), state, true)) {
                cVar = cVar2;
                break;
            }
            i++;
        }
        if (cVar == null) {
            cVar = com.revolut.feature.payments.messaging.data.api.model.c.UNKNOWN;
        }
        return new MessageType.PricingPlanGift(id10, bVar3, period, assetUri, cVar);
    }

    public static kv9.b e(MessageType.PricingPlanGift pricingPlanGift) {
        String f79550b = pricingPlanGift.getF79550b();
        String string = pricingPlanGift.getD().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new kv9.b(f79550b, pricingPlanGift.getF79551c().name(), string, pricingPlanGift.getE(), pricingPlanGift.getF().name());
    }

    public static kv9.o f(MessageType.PlanReferral planReferral) {
        String f79546b = planReferral.getF79546b();
        String strName = planReferral.getF79547c().name();
        String d = planReferral.getD();
        String string = planReferral.getE().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new kv9.o(f79546b, strName, d, string, planReferral.getF(), planReferral.getF79548g().toEpochMilli(), planReferral.getF79549h());
    }

    public static r g(MessageType.Referral referral) {
        return new r(referral.getF79552b(), referral.getF79553c(), referral.getD(), new r.a(referral.getE().getF79554a(), referral.getE().getF79555b()));
    }

    public static kv9.t h(MessageType.SalaryReferral salaryReferral) {
        return new kv9.t(salaryReferral.getF79556b(), salaryReferral.getF79557c(), salaryReferral.getD(), salaryReferral.getE().toEpochMilli(), new t.a(salaryReferral.getF().getF79558a()));
    }

    public final MessageType a(String type, String media) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(media, "media");
        try {
            String upperCase = type.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int i = i.f168790a[dv9.s.valueOf(upperCase).ordinal()];
            o oVar = this.f168791a;
            switch (i) {
                case 1:
                    return new MessageType.Sticker(media);
                case 2:
                    return new MessageType.Gif(media);
                case 3:
                    return new MessageType.Emoji(media);
                case 4:
                    return new MessageType.Text(media);
                case 5:
                    return new MessageType.Key(media);
                case 6:
                    Object objC = oVar.c(media, kv9.b.class);
                    Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
                    return d((kv9.b) objC);
                case 7:
                    Object objC2 = oVar.c(media, kv9.o.class);
                    Intrinsics.checkNotNullExpressionValue(objC2, "fromJson(...)");
                    return c((kv9.o) objC2);
                case 8:
                    Object objC3 = oVar.c(media, kv9.c.class);
                    Intrinsics.checkNotNullExpressionValue(objC3, "fromJson(...)");
                    kv9.c cVar = (kv9.c) objC3;
                    return new MessageType.GiphyGifId(cVar.getUrl(), cVar.getId());
                case 9:
                    Object objC4 = oVar.c(media, r.class);
                    Intrinsics.checkNotNullExpressionValue(objC4, "fromJson(...)");
                    r rVar = (r) objC4;
                    return new MessageType.Referral(rVar.getId(), rVar.getImageUrl(), rVar.getMessage(), new MessageType.Referral.ReferralAction(rVar.getAction().getMessage(), rVar.getAction().getDeeplink()));
                case 10:
                    Object objC5 = oVar.c(media, kv9.t.class);
                    Intrinsics.checkNotNullExpressionValue(objC5, "fromJson(...)");
                    kv9.t tVar = (kv9.t) objC5;
                    String id10 = tVar.getId();
                    String imageUrl = tVar.getImageUrl();
                    String title = tVar.getTitle();
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(tVar.getExpirationDate());
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                    return new MessageType.SalaryReferral(id10, imageUrl, title, instantOfEpochMilli, new MessageType.SalaryReferral.SalaryReferralAction(tVar.getAction().getDeeplink()));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WTF, "ChatMessageMapper", null, e, null, 16);
            return null;
        }
    }

    public final MessageItem i(a chatMessageEntity, dv9.m conversation, String str) {
        dv9.n nVar;
        Intrinsics.checkNotNullParameter(chatMessageEntity, "chatMessageEntity");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        String strG = chatMessageEntity.g();
        String str2 = conversation.f118076a;
        if ((!Intrinsics.f(strG, str2) && !Intrinsics.f(chatMessageEntity.f(), str2)) || chatMessageEntity.d() == null || chatMessageEntity.j() == null) {
            return null;
        }
        MessageType messageTypeA = a(chatMessageEntity.j(), chatMessageEntity.d());
        if (messageTypeA == null) {
            return null;
        }
        dv9.e eVar = dv9.f.Companion;
        String strH = chatMessageEntity.h();
        eVar.getClass();
        dv9.f fVarA = dv9.e.a(strH);
        if (fVarA == null) {
            return null;
        }
        if (conversation instanceof dv9.k) {
            nVar = Intrinsics.f(((dv9.k) conversation).a(), chatMessageEntity.g()) ? dv9.n.OUTGOING : dv9.n.INCOMING;
        } else {
            if (!(conversation instanceof dv9.l)) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = Intrinsics.f(str2, chatMessageEntity.f()) ? dv9.n.OUTGOING : dv9.n.INCOMING;
        }
        dv9.n nVar2 = nVar;
        String strC = chatMessageEntity.c();
        dv9.c cVar = dv9.d.Companion;
        String strI = chatMessageEntity.i();
        cVar.getClass();
        return new MessageItem(strC, new DateTime(chatMessageEntity.b()), nVar2, new DateTime(chatMessageEntity.k()), new MessageAuthor(chatMessageEntity.g()), chatMessageEntity.f(), chatMessageEntity.l(), messageTypeA, str, dv9.c.a(strI), fVarA, chatMessageEntity.e());
    }

    public final a j(MessageItem messageItem) {
        String strK;
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        MessageType f79535h = messageItem.getF79535h();
        MessageType.Text text = f79535h instanceof MessageType.Text ? (MessageType.Text) f79535h : null;
        MessageMetadata messageMetadataR = text != null ? this.f168792b.r(text.getF79560b()) : null;
        String f79578a = messageItem.getF79578a();
        String f79529a = messageItem.getE().getF79529a();
        String f = messageItem.getF();
        MessageType f79535h2 = messageItem.getF79535h();
        if (f79535h2 instanceof MessageType.Sticker) {
            strK = ((MessageType.Sticker) f79535h2).getF79559b();
        } else if (f79535h2 instanceof MessageType.Gif) {
            strK = ((MessageType.Gif) f79535h2).getF79542b();
        } else {
            boolean z = f79535h2 instanceof MessageType.GiphyGifId;
            o oVar = this.f168791a;
            if (z) {
                MessageType.GiphyGifId giphyGifId = (MessageType.GiphyGifId) f79535h2;
                strK = oVar.k(new kv9.c(giphyGifId.getF79544c(), giphyGifId.getF79543b()));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else if (f79535h2 instanceof MessageType.Emoji) {
                strK = ((MessageType.Emoji) f79535h2).getF79541b();
            } else if (f79535h2 instanceof MessageType.Text) {
                strK = ((MessageType.Text) f79535h2).getF79560b();
            } else if (f79535h2 instanceof MessageType.Key) {
                strK = ((MessageType.Key) f79535h2).getF79545b();
            } else if (f79535h2 instanceof MessageType.PricingPlanGift) {
                strK = oVar.k(e((MessageType.PricingPlanGift) f79535h2));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else if (f79535h2 instanceof MessageType.PlanReferral) {
                strK = oVar.k(f((MessageType.PlanReferral) f79535h2));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else if (f79535h2 instanceof MessageType.Referral) {
                strK = oVar.k(g((MessageType.Referral) f79535h2));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else {
                if (!(f79535h2 instanceof MessageType.SalaryReferral)) {
                    throw new NoWhenBranchMatchedException();
                }
                strK = oVar.k(h((MessageType.SalaryReferral) f79535h2));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            }
        }
        return new a(f79578a, f79529a, f, strK, messageItem.getF79535h().getF79540a().name(), messageItem.getF79534g(), messageItem.getF79571b().getMillis(), messageItem.getD().getMillis(), messageItem.getF79536j().getId(), messageItem.getK().getId(), messageMetadataR);
    }

    public final u k(MessageItem messageItem) {
        String strK;
        Intrinsics.checkNotNullParameter(messageItem, "messageItem");
        kv9.i iVar = new kv9.i(messageItem.getF(), messageItem.getF());
        MessageType f79535h = messageItem.getF79535h();
        if (f79535h instanceof MessageType.Sticker) {
            strK = ((MessageType.Sticker) f79535h).getF79559b();
        } else if (f79535h instanceof MessageType.Gif) {
            strK = ((MessageType.Gif) f79535h).getF79542b();
        } else if (f79535h instanceof MessageType.GiphyGifId) {
            strK = ((MessageType.GiphyGifId) f79535h).getF79544c();
        } else if (f79535h instanceof MessageType.Emoji) {
            strK = ((MessageType.Emoji) f79535h).getF79541b();
        } else if (f79535h instanceof MessageType.Text) {
            strK = ((MessageType.Text) f79535h).getF79560b();
        } else if (f79535h instanceof MessageType.Key) {
            strK = ((MessageType.Key) f79535h).getF79545b();
        } else {
            boolean z = f79535h instanceof MessageType.PricingPlanGift;
            o oVar = this.f168791a;
            if (z) {
                strK = oVar.k(e((MessageType.PricingPlanGift) f79535h));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else if (f79535h instanceof MessageType.PlanReferral) {
                strK = oVar.k(f((MessageType.PlanReferral) f79535h));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else if (f79535h instanceof MessageType.Referral) {
                strK = oVar.k(g((MessageType.Referral) f79535h));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            } else {
                if (!(f79535h instanceof MessageType.SalaryReferral)) {
                    throw new NoWhenBranchMatchedException();
                }
                strK = oVar.k(h((MessageType.SalaryReferral) f79535h));
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
            }
        }
        return new u(iVar, strK, messageItem.getF79535h().getF79540a().name());
    }
}
