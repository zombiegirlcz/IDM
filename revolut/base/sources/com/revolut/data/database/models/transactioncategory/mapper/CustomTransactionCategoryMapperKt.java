package com.revolut.data.database.models.transactioncategory.mapper;

import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity;
import com.revolut.data.network.models.budgeting.CustomCategoryDto;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import ib.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import tof.j3;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\f\"&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "Ltof/j3;", "toDomain", "(Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;)Ltof/j3;", "Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;", "toDto", "(Ltof/j3;)Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;", "Lcom/revolut/feature/core/model/domain/wallet/WalletId;", "walletId", "toEntity-4GPy_8k", "(Ltof/j3;Ljava/lang/String;)Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "toEntity", "(Lcom/revolut/data/network/models/budgeting/CustomCategoryDto;Ljava/lang/String;)Lcom/revolut/data/database/models/transactioncategory/TransactionCustomCategoryEntity;", "", "", "Lcom/revolut/domain/models/transactions/CategoryImage;", "transactionCategoryImageMapper", "Ljava/util/Map;", "getTransactionCategoryImageMapper", "()Ljava/util/Map;", "Lcom/revolut/domain/models/transactions/CategoryColor;", "transactionCategoryColorMapper", "getTransactionCategoryColorMapper", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CustomTransactionCategoryMapperKt {

    @NotNull
    private static final Map<String, CategoryColor> transactionCategoryColorMapper;

    @NotNull
    private static final Map<String, CategoryImage> transactionCategoryImageMapper;

    static {
        Pair pair = new Pair(b.Screen, CategoryImage.SCREEN);
        Pair pair2 = new Pair("football", CategoryImage.FOOTBALL);
        Pair pair3 = new Pair("smoking", CategoryImage.CYCLE);
        Pair pair4 = new Pair("smile", CategoryImage.SMILE);
        Pair pair5 = new Pair("scissors", CategoryImage.SCISSORS);
        Pair pair6 = new Pair("rocket", CategoryImage.ROCKET);
        Pair pair7 = new Pair("phone", CategoryImage.PHONE);
        Pair pair8 = new Pair("man", CategoryImage.MAN);
        Pair pair9 = new Pair("infinity", CategoryImage.INFINITY);
        Pair pair10 = new Pair("health", CategoryImage.HEALTH);
        Pair pair11 = new Pair("hat", CategoryImage.HAT);
        Pair pair12 = new Pair("hamburger", CategoryImage.HAMBURGER);
        Pair pair13 = new Pair("flag", CategoryImage.FLAG);
        Pair pair14 = new Pair("drink", CategoryImage.DRINK);
        Pair pair15 = new Pair("dog", CategoryImage.DOG);
        CategoryImage categoryImage = CategoryImage.COFFEE;
        Pair pair16 = new Pair("coffee", categoryImage);
        Pair pair17 = new Pair("chart", CategoryImage.CHART);
        Pair pair18 = new Pair("car", CategoryImage.CAR);
        Pair pair19 = new Pair("cake", CategoryImage.CAKE);
        CategoryImage categoryImage2 = CategoryImage.BASKETBALL;
        transactionCategoryImageMapper = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, new Pair("basketball", categoryImage2), new Pair("bulb", CategoryImage.BULB), new Pair("coins", CategoryImage.COINS), new Pair("groceries", CategoryImage.GROCERIES), new Pair("cart", CategoryImage.CART), new Pair("restaurant", CategoryImage.RESTAURANT), new Pair("transport", CategoryImage.TRANSPORT), new Pair("travel", CategoryImage.TRAVEL), new Pair("entertainment", CategoryImage.ENTERTAINMENT), new Pair("utilities", CategoryImage.UTILITIES), new Pair("heart", CategoryImage.HEART), new Pair("services", CategoryImage.SERVICES), new Pair("transfers", CategoryImage.TRANSFERS), new Pair("cash", CategoryImage.CASH), new Pair("insurance", CategoryImage.INSURANCE), new Pair("envelope", CategoryImage.ENVELOPE), new Pair("vault", CategoryImage.VAULT), new Pair("invest", CategoryImage.INVEST), new Pair("gift", CategoryImage.GIFT), new Pair("form", CategoryImage.FORM), new Pair("basketball", categoryImage2), new Pair("coffee", categoryImage));
        CategoryColor categoryColor = CategoryColor.RED;
        Pair pair20 = new Pair("red", categoryColor);
        Pair pair21 = new Pair("brightRed", categoryColor);
        CategoryColor categoryColor2 = CategoryColor.PINK;
        Pair pair22 = new Pair("pink", categoryColor2);
        Pair pair23 = new Pair("brightPink", categoryColor2);
        CategoryColor categoryColor3 = CategoryColor.PURPLE;
        Pair pair24 = new Pair("purple", categoryColor3);
        Pair pair25 = new Pair("brightPurple", categoryColor3);
        CategoryColor categoryColor4 = CategoryColor.DEEP_PURPLE;
        Pair pair26 = new Pair("deepPurple", categoryColor4);
        Pair pair27 = new Pair("brightDeepPurple", categoryColor4);
        CategoryColor categoryColor5 = CategoryColor.INDIGO;
        Pair pair28 = new Pair("indigo", categoryColor5);
        Pair pair29 = new Pair("brightIndigo", categoryColor5);
        CategoryColor categoryColor6 = CategoryColor.LIGHT_BLUE;
        Pair pair30 = new Pair("lightBlue", categoryColor6);
        Pair pair31 = new Pair("brightBlue", categoryColor6);
        CategoryColor categoryColor7 = CategoryColor.CYAN;
        Pair pair32 = new Pair("cyan", categoryColor7);
        Pair pair33 = new Pair("brightCyan", categoryColor7);
        CategoryColor categoryColor8 = CategoryColor.TEAL;
        Pair pair34 = new Pair("teal", categoryColor8);
        Pair pair35 = new Pair("brightTeal", categoryColor8);
        CategoryColor categoryColor9 = CategoryColor.GREEN;
        Pair pair36 = new Pair("green", categoryColor9);
        Pair pair37 = new Pair("brightGreen", categoryColor9);
        CategoryColor categoryColor10 = CategoryColor.LIGHT_GREEN;
        Pair pair38 = new Pair("lightGreen", categoryColor10);
        Pair pair39 = new Pair("brightLightGreen", categoryColor10);
        CategoryColor categoryColor11 = CategoryColor.YELLOW;
        transactionCategoryColorMapper = r0.k(pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, new Pair("yellow", categoryColor11), new Pair("brightYellow", categoryColor11), new Pair("blue", CategoryColor.BLUE), new Pair("brown", CategoryColor.BROWN), new Pair("orange", CategoryColor.ORANGE), new Pair("deepGrey", CategoryColor.DEEP_GREY), new Pair("deepPink", CategoryColor.DEEP_PINK));
    }

    @NotNull
    public static final Map<String, CategoryColor> getTransactionCategoryColorMapper() {
        return transactionCategoryColorMapper;
    }

    @NotNull
    public static final Map<String, CategoryImage> getTransactionCategoryImageMapper() {
        return transactionCategoryImageMapper;
    }

    @NotNull
    public static final j3 toDomain(@NotNull TransactionCustomCategoryEntity transactionCustomCategoryEntity) {
        Intrinsics.checkNotNullParameter(transactionCustomCategoryEntity, "<this>");
        String id10 = transactionCustomCategoryEntity.getId();
        String title = transactionCustomCategoryEntity.getTitle();
        String walletId = transactionCustomCategoryEntity.getWalletId();
        return new j3((CategoryColor) u1.t(transactionCustomCategoryEntity.getColor(), CategoryColor.RED, transactionCategoryColorMapper), (CategoryImage) u1.t(transactionCustomCategoryEntity.getImage(), CategoryImage.FOOTBALL, transactionCategoryImageMapper), id10, walletId, title);
    }

    @NotNull
    public static final CustomCategoryDto toDto(@NotNull j3 j3Var) {
        Intrinsics.checkNotNullParameter(j3Var, "<this>");
        String str = j3Var.f272843a;
        String str2 = j3Var.f272845c;
        CategoryImage categoryImage = j3Var.d;
        String strH = categoryImage != null ? u1.h(categoryImage, transactionCategoryImageMapper) : null;
        if (strH == null) {
            strH = "";
        }
        CategoryColor categoryColor = j3Var.e;
        String strH2 = categoryColor != null ? u1.h(categoryColor, transactionCategoryColorMapper) : null;
        return new CustomCategoryDto(str, str2, strH, strH2 != null ? strH2 : "");
    }

    @NotNull
    /* JADX INFO: renamed from: toEntity-4GPy_8k, reason: not valid java name */
    public static final TransactionCustomCategoryEntity m3754toEntity4GPy_8k(@NotNull j3 toEntity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(toEntity, "$this$toEntity");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        String str2 = toEntity.f272843a;
        String str3 = toEntity.f272845c;
        CategoryImage categoryImage = toEntity.d;
        String strG = categoryImage != null ? u1.g(categoryImage, transactionCategoryImageMapper) : null;
        String str4 = strG == null ? "" : strG;
        CategoryColor categoryColor = toEntity.e;
        String strG2 = categoryColor != null ? u1.g(categoryColor, transactionCategoryColorMapper) : null;
        return new TransactionCustomCategoryEntity(str2, str, str3, str4, strG2 == null ? "" : strG2);
    }

    @NotNull
    /* JADX INFO: renamed from: toEntity-4GPy_8k, reason: not valid java name */
    public static final TransactionCustomCategoryEntity m3753toEntity4GPy_8k(@NotNull CustomCategoryDto toEntity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(toEntity, "$this$toEntity");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        return new TransactionCustomCategoryEntity(toEntity.getId(), str, toEntity.getName(), toEntity.getLogo(), toEntity.getColor());
    }
}
