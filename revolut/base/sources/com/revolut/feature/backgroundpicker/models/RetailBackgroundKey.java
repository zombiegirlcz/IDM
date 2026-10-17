package com.revolut.feature.backgroundpicker.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.uipersonalisation.api.AbstractThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.AlexKDeclaration;
import com.revolut.feature.uipersonalisation.api.ApexThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.BusinessThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ColoursThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CryptoThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.Cyberpunk2ThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CyberpunkThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.DogsDeclaration;
import com.revolut.feature.uipersonalisation.api.ExploreThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.FlowersDeclaration;
import com.revolut.feature.uipersonalisation.api.GeometricDeclaration;
import com.revolut.feature.uipersonalisation.api.GlassThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HorizonThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.JuniorGlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LavaThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LegacyDefaultThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LightsThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LinesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MetalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MinimalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ParticlesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PremiumThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrideThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrivateThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PsychedelicDeclaration;
import com.revolut.feature.uipersonalisation.api.RevolutXThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.SnakeThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.TravertineDeclaration;
import com.revolut.feature.uipersonalisation.api.UKLandscapesDeclaration;
import com.revolut.feature.uipersonalisation.api.UltraThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.UpbeatThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.VelvetDeclaration;
import com.revolut.feature.uipersonalisation.api.ZodiacThemeDeclaration;
import em2.j;
import em2.k;
import j6.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.d;
import md6.e;
import md6.f;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0016\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/api/model/ThemedBackgroundKey;", "<init>", "()V", "Credit", "Joint", "Collateral", "Linked", "PersonalCurrency", "OnHold", "Pro", "SavingsKey", "SavingsAccount", "SavingsChallenge", "SubAccount", "SubAccountPersonal", "SplitBillGroupCreation", "SubAccountGroup", "SubAccountPlanCashback", "Youth", "CryptoHome", "CryptoAccount", "CryptoHomeKey", "InvestHome", "InvestAccount", "InvestHomeKey", "HelpCentre", "SubAccountRevPointsPocket", "YouthSavings", "RevPointsHome", "RevPointsAccount", "RevPointsHomeKey", "DeFiHome", "TotalWealthHome", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Collateral;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Credit;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$DeFiHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$HelpCentre;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Joint;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Linked;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$OnHold;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$PersonalCurrency;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Pro;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SplitBillGroupCreation;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountGroup;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountPersonal;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountPlanCashback;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountRevPointsPocket;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$TotalWealthHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Youth;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$YouthSavings;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RetailBackgroundKey extends ThemedBackgroundKey {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Collateral;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Collateral extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Collateral> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63820c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Collateral(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Collateral[i];
            }
        }

        public Collateral(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63818a = str;
            this.f63819b = bVar;
            this.f63820c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "Collateral";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg524";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg105";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg118";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg141";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg020";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg192";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg162";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg009";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg074";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg087";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg230";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg240";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg262";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg274";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg249";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg307";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg340";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg318";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg329";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg355";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg365";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg376";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg387";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg398";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg415";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg426";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg283";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg435";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg446";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg457";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63820c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Collateral)) {
                return false;
            }
            Collateral collateral = (Collateral) obj2;
            return Intrinsics.f(this.f63818a, collateral.f63818a) && Intrinsics.f(this.f63819b, collateral.f63819b) && Intrinsics.f(this.f63820c, collateral.f63820c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63819b;
        }

        public final int hashCode() {
            String str = this.f63818a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63819b;
            return this.f63820c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63818a);
            dest.writeSerializable(this.f63819b);
            this.f63820c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Credit;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Credit extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Credit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63823c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Credit(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Credit[i];
            }
        }

        public Credit(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63821a = str;
            this.f63822b = bVar;
            this.f63823c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Credit_id_", this.f63821a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg107";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg120";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg143";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg114";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg194";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg169";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg015";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg065";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg089";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg557";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg233";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg239";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg261";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg270";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg251";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg309";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg342";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg320";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg331";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg354";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg367";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg378";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg389";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg400";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg421";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg432";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg285";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg437";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg448";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg459";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg525";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63823c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Credit)) {
                return false;
            }
            Credit credit = (Credit) obj2;
            return Intrinsics.f(this.f63821a, credit.f63821a) && Intrinsics.f(this.f63822b, credit.f63822b) && Intrinsics.f(this.f63823c, credit.f63823c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63822b;
        }

        public final int hashCode() {
            String str = this.f63821a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63822b;
            return this.f63823c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63821a);
            dest.writeSerializable(this.f63822b);
            this.f63823c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHomeKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoAccount extends CryptoHomeKey {

        @NotNull
        public static final Parcelable.Creator<CryptoAccount> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f63824b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoAccount(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoAccount(d accountState) {
            super(accountState);
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            this.f63824b = accountState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoAccount) && this.f63824b == ((CryptoAccount) obj2).f63824b;
        }

        public final int hashCode() {
            return this.f63824b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63824b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHomeKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoHome extends CryptoHomeKey {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CryptoHome f63825b = new CryptoHome();

        @NotNull
        public static final Parcelable.Creator<CryptoHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoHome.f63825b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoHome[i];
            }
        }

        private CryptoHome() {
            super(d.OPENED);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$CryptoHome;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class CryptoHomeKey extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63826a;

        public CryptoHomeKey(d dVar) {
            this.f63826a = dVar;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "CryptoHome";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg529";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg106";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg123";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg151";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg111";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg198";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg158";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg134";
            }
            if ((theme instanceof ColoursThemeDeclaration) || (theme instanceof LegacyDefaultThemeDeclaration)) {
                return "bg067";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg554";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg209";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg245";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg267";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg279";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg255";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg313";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg346";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg324";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg335";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg361";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg371";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg382";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg393";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg404";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg420";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg431";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg289";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg442";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg453";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg464";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return new EntityInfo(e.CRYPTO, null, this.f63826a, 2);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$DeFiHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeFiHome extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeFiHome f63827a = new DeFiHome();

        @NotNull
        public static final Parcelable.Creator<DeFiHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeFiHome.f63827a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFiHome[i];
            }
        }

        private DeFiHome() {
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "DeFiHome";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg529";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg109";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg124";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg151";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg112";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg199";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg171";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg138";
            }
            if ((theme instanceof ColoursThemeDeclaration) || (theme instanceof LegacyDefaultThemeDeclaration)) {
                return "bg068";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg213";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg238";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg260";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg272";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg256";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg315";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg348";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg326";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg337";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg353";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg371";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg382";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg393";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg404";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg416";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg427";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg291";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg443";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg451";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg464";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return new EntityInfo(e.CRYPTO, null, null, 6);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$HelpCentre;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HelpCentre extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HelpCentre f63828a = new HelpCentre();

        @NotNull
        public static final Parcelable.Creator<HelpCentre> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HelpCentre.f63828a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HelpCentre[i];
            }
        }

        private HelpCentre() {
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "HelpCentre";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg521";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg092";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg116";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg139";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg016";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg190";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg156";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg003";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg084";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg001";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg209";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg236";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg258";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg270";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg247";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg350";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg338";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg316";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg327";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg352";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg363";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg374";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg385";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg396";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg412";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg424";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg281";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg433";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg444";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg455";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return null;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHomeKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestAccount extends InvestHomeKey {

        @NotNull
        public static final Parcelable.Creator<InvestAccount> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f63829b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestAccount(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvestAccount(d accountState) {
            super(accountState);
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            this.f63829b = accountState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvestAccount) && this.f63829b == ((InvestAccount) obj2).f63829b;
        }

        public final int hashCode() {
            return this.f63829b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63829b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHomeKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvestHome extends InvestHomeKey {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InvestHome f63830b = new InvestHome();

        @NotNull
        public static final Parcelable.Creator<InvestHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvestHome.f63830b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestHome[i];
            }
        }

        private InvestHome() {
            super(d.OPENED);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$InvestHome;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class InvestHomeKey extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63831a;

        public InvestHomeKey(d dVar) {
            this.f63831a = dVar;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "InvestHome";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg528";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg099";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg126";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg152";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg113";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg197";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg163";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg133";
            }
            if ((theme instanceof ColoursThemeDeclaration) || (theme instanceof LegacyDefaultThemeDeclaration)) {
                return "bg063";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg553";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg208";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg244";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg266";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg278";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg254";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg312";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg345";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg323";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg334";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg360";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg370";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg381";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg392";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg403";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg411";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg422";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg288";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg441";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg452";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg463";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return new EntityInfo(e.INVEST, null, this.f63831a, 2);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Joint;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63834c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63832a = str;
            this.f63833b = bVar;
            this.f63834c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Joint_id_", this.f63832a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg523";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg105";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg118";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg141";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg020";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg192";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg162";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg009";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg074";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg087";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg230";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg240";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg262";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg274";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg249";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg307";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg340";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg318";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg329";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg355";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg365";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg376";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg387";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg398";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg415";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg426";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg283";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg435";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg446";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg457";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63834c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Joint)) {
                return false;
            }
            Joint joint = (Joint) obj2;
            return Intrinsics.f(this.f63832a, joint.f63832a) && Intrinsics.f(this.f63833b, joint.f63833b) && Intrinsics.f(this.f63834c, joint.f63834c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63833b;
        }

        public final int hashCode() {
            String str = this.f63832a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63833b;
            return this.f63834c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63832a);
            dest.writeSerializable(this.f63833b);
            this.f63834c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Linked;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Linked extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Linked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63837c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Linked(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Linked[i];
            }
        }

        public Linked(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63835a = str;
            this.f63836b = bVar;
            this.f63837c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Linked_id_", this.f63835a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg527";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg094";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg120";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg145";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg091";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg196";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg165";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg018";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg071";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg091";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg234";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg243";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg265";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg277";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg253";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg311";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg344";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg322";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg333";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg359";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg369";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg380";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg391";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg402";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg414";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg425";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg287";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg439";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg450";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg461";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63837c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Linked)) {
                return false;
            }
            Linked linked = (Linked) obj2;
            return Intrinsics.f(this.f63835a, linked.f63835a) && Intrinsics.f(this.f63836b, linked.f63836b) && Intrinsics.f(this.f63837c, linked.f63837c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63836b;
        }

        public final int hashCode() {
            String str = this.f63835a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63836b;
            return this.f63837c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63835a);
            dest.writeSerializable(this.f63836b);
            this.f63837c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$OnHold;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnHold extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<OnHold> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63840c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnHold(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnHold[i];
            }
        }

        public OnHold(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63838a = str;
            this.f63839b = bVar;
            this.f63840c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("OnHold_id_", this.f63838a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg521";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg092";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg116";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg139";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg016";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg190";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg156";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg003";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg084";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg001";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg212";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg236";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg258";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg270";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg247";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg350";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg338";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg316";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg327";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg352";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg363";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg374";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg385";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg396";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg412";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg424";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg281";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg433";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg444";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg455";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63840c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnHold)) {
                return false;
            }
            OnHold onHold = (OnHold) obj2;
            return Intrinsics.f(this.f63838a, onHold.f63838a) && Intrinsics.f(this.f63839b, onHold.f63839b) && Intrinsics.f(this.f63840c, onHold.f63840c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63839b;
        }

        public final int hashCode() {
            String str = this.f63838a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63839b;
            return this.f63840c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63838a);
            dest.writeSerializable(this.f63839b);
            this.f63840c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$PersonalCurrency;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalCurrency extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<PersonalCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63843c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalCurrency(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCurrency[i];
            }
        }

        public PersonalCurrency(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63841a = str;
            this.f63842b = bVar;
            this.f63843c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("CurrencyAccount_id_", this.f63841a);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey, com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final k c() {
            b bVar = this.f63842b;
            if (bVar == null) {
                return null;
            }
            em2.b.Companion.getClass();
            return new j(em2.a.a(), bVar);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg521";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg092";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg116";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg139";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg016";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg190";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg156";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg003";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg084";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg001";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg212";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg236";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg258";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg270";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg247";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg350";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg338";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg316";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg327";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg352";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg363";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg374";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg385";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg396";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg412";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg424";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg281";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg433";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg444";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg455";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63843c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalCurrency)) {
                return false;
            }
            PersonalCurrency personalCurrency = (PersonalCurrency) obj2;
            return Intrinsics.f(this.f63841a, personalCurrency.f63841a) && Intrinsics.f(this.f63842b, personalCurrency.f63842b) && Intrinsics.f(this.f63843c, personalCurrency.f63843c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63842b;
        }

        public final int hashCode() {
            String str = this.f63841a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63842b;
            return this.f63843c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63841a);
            dest.writeSerializable(this.f63842b);
            this.f63843c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Pro;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63846c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63844a = str;
            this.f63845b = bVar;
            this.f63846c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Pro_id_", this.f63844a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg524";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg098";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg119";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg142";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg005";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg193";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg173";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg132";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg064";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg088";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg235";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg241";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg263";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg275";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg250";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg308";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg341";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg319";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg330";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg357";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg366";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg377";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg388";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg399";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg417";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg428";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg284";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg436";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg447";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg458";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63846c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pro)) {
                return false;
            }
            Pro pro = (Pro) obj2;
            return Intrinsics.f(this.f63844a, pro.f63844a) && Intrinsics.f(this.f63845b, pro.f63845b) && Intrinsics.f(this.f63846c, pro.f63846c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63845b;
        }

        public final int hashCode() {
            String str = this.f63844a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63845b;
            return this.f63846c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63844a);
            dest.writeSerializable(this.f63845b);
            this.f63846c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHomeKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsAccount extends RevPointsHomeKey {

        @NotNull
        public static final Parcelable.Creator<RevPointsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f63847b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsAccount(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsAccount[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsAccount(d accountState) {
            super(accountState);
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            this.f63847b = accountState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsAccount) && this.f63847b == ((RevPointsAccount) obj2).f63847b;
        }

        public final int hashCode() {
            return this.f63847b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63847b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHomeKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsHome extends RevPointsHomeKey {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RevPointsHome f63848b = new RevPointsHome();

        @NotNull
        public static final Parcelable.Creator<RevPointsHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsHome.f63848b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsHome[i];
            }
        }

        private RevPointsHome() {
            super(d.OPENED);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHomeKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$RevPointsHome;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class RevPointsHomeKey extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f63849a;

        public RevPointsHomeKey(d dVar) {
            this.f63849a = dVar;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "RevPointsHome";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg530";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg106";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg127";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg142";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg031";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg200";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg159";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg028";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg085";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg200";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg555";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg210";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg246";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg268";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg280";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg257";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg314";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg347";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg325";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg336";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg362";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg372";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg383";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg394";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg405";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg419";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg430";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg290";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg443";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg454";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg465";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return new EntityInfo(e.REV_POINTS, null, this.f63849a, 2);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAccount extends SavingsKey {

        @NotNull
        public static final Parcelable.Creator<SavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63852c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccount(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccount[i];
            }
        }

        public SavingsAccount(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63850a = str;
            this.f63851b = bVar;
            this.f63852c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF63853a() {
            return this.f63850a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63852c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsAccount)) {
                return false;
            }
            SavingsAccount savingsAccount = (SavingsAccount) obj2;
            return Intrinsics.f(this.f63850a, savingsAccount.f63850a) && Intrinsics.f(this.f63851b, savingsAccount.f63851b) && Intrinsics.f(this.f63852c, savingsAccount.f63852c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63851b;
        }

        public final int hashCode() {
            String str = this.f63850a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63851b;
            return this.f63852c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63850a);
            dest.writeSerializable(this.f63851b);
            this.f63852c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsChallenge;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsChallenge extends SavingsKey {

        @NotNull
        public static final Parcelable.Creator<SavingsChallenge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63855c;
        public final int d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsChallenge(parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : EntityInfo.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsChallenge[i];
            }
        }

        public SavingsChallenge(String str, b bVar, EntityInfo entityInfo, int i) {
            this.f63853a = str;
            this.f63854b = bVar;
            this.f63855c = entityInfo;
            this.d = i;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF63853a() {
            return this.f63853a;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.SavingsKey, com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("SavingsChallenge_id_", this.f63853a);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey.SavingsKey, com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            return a0.d.n("bg", this.d + 539);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63855c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsChallenge)) {
                return false;
            }
            SavingsChallenge savingsChallenge = (SavingsChallenge) obj2;
            return Intrinsics.f(this.f63853a, savingsChallenge.f63853a) && Intrinsics.f(this.f63854b, savingsChallenge.f63854b) && Intrinsics.f(this.f63855c, savingsChallenge.f63855c) && this.d == savingsChallenge.d;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63854b;
        }

        public final int hashCode() {
            String str = this.f63853a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63854b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            EntityInfo entityInfo = this.f63855c;
            return Integer.hashCode(this.d) + ((iHashCode2 + (entityInfo != null ? entityInfo.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63853a);
            dest.writeSerializable(this.f63854b);
            EntityInfo entityInfo = this.f63855c;
            if (entityInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                entityInfo.writeToParcel(dest, i);
            }
            dest.writeInt(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsKey;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "<init>", "()V", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SavingsChallenge;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SavingsKey extends RetailBackgroundKey {
        private SavingsKey() {
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public String b() {
            return a.q("Savings_id_", getF63853a());
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg522";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg097";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg117";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg140";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg115";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg191";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg172";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg004";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg066";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg086";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg559";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg231";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg237";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg259";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg271";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg248";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg351";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg339";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg317";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg328";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg356";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg364";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg375";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg386";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg397";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg418";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg429";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg282";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg434";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg445";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg456";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SplitBillGroupCreation;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitBillGroupCreation extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f63857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63858c;

        @NotNull
        public static final Parcelable.Creator<SplitBillGroupCreation> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplitBillGroupCreation(parcel.readString(), (xi0.b) parcel.readSerializable(), parcel.readInt() == 0 ? null : EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitBillGroupCreation[i];
            }
        }

        public SplitBillGroupCreation(String str, xi0.b bVar, EntityInfo entityInfo) {
            this.f63856a = str;
            this.f63857b = bVar;
            this.f63858c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return a.q("SplitBillGroupCreation_id_", this.f63856a);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            String str = this.f63856a;
            if (str == null) {
                return "bg190";
            }
            switch (str.hashCode()) {
                case -1663892670:
                    return !str.equals("suggestionParty") ? "bg190" : "bg195";
                case -327516536:
                    return !str.equals("suggestionFamily") ? "bg190" : "bg194";
                case -53899005:
                    return !str.equals("suggestionHome") ? "bg190" : "bg196";
                case 1786105151:
                    return !str.equals("suggestionHolidays") ? "bg190" : "bg192";
                default:
                    return "bg190";
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63858c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitBillGroupCreation)) {
                return false;
            }
            SplitBillGroupCreation splitBillGroupCreation = (SplitBillGroupCreation) obj2;
            return Intrinsics.f(this.f63856a, splitBillGroupCreation.f63856a) && Intrinsics.f(this.f63857b, splitBillGroupCreation.f63857b) && Intrinsics.f(this.f63858c, splitBillGroupCreation.f63858c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final xi0.b getF63879b() {
            return this.f63857b;
        }

        public final int hashCode() {
            String str = this.f63856a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            xi0.b bVar = this.f63857b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            EntityInfo entityInfo = this.f63858c;
            return iHashCode2 + (entityInfo != null ? entityInfo.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63856a);
            dest.writeSerializable(this.f63857b);
            EntityInfo entityInfo = this.f63858c;
            if (entityInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                entityInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccount;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubAccount extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<SubAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63861c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubAccount(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubAccount[i];
            }
        }

        public SubAccount(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63859a = str;
            this.f63860b = bVar;
            this.f63861c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("SubAccount_id_", this.f63859a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg521";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg103";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg127";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg146";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg088";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg199";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg159";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg035";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg085";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg035";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg556";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg214";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg238";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg260";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg272";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg256";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg315";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg347";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg326";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg337";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg353";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg363";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg374";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg395";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg396";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg416";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg427";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg291";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg443";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg451";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg461";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63861c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubAccount)) {
                return false;
            }
            SubAccount subAccount = (SubAccount) obj2;
            return Intrinsics.f(this.f63859a, subAccount.f63859a) && Intrinsics.f(this.f63860b, subAccount.f63860b) && Intrinsics.f(this.f63861c, subAccount.f63861c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63860b;
        }

        public final int hashCode() {
            String str = this.f63859a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63860b;
            return this.f63861c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63859a);
            dest.writeSerializable(this.f63860b);
            this.f63861c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountGroup;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubAccountGroup extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f63863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63864c;

        @NotNull
        public static final Parcelable.Creator<SubAccountGroup> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubAccountGroup(parcel.readString(), (xi0.b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubAccountGroup[i];
            }
        }

        public SubAccountGroup(String str, xi0.b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63862a = str;
            this.f63863b = bVar;
            this.f63864c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return a.q("VaultGroup_id_", this.f63862a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            boolean z = theme instanceof UKLandscapesDeclaration;
            String str = this.f63862a;
            if (z) {
                if (str == null) {
                    return "bg524";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg524" : "bg528";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg524" : "bg526";
                    case -510663909:
                        return !str.equals("holidays") ? "bg524" : "bg525";
                    case -290756696:
                        return !str.equals("education") ? "bg524" : "bg530";
                    case 3172656:
                        return !str.equals("gift") ? "bg524" : "bg529";
                    default:
                        return "bg524";
                }
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                if (str == null) {
                    return "bg096";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg096" : "bg102";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg096" : "bg093";
                    case -510663909:
                        return !str.equals("holidays") ? "bg096" : "bg098";
                    case -290756696:
                        return !str.equals("education") ? "bg096" : "bg094";
                    case 3172656:
                        return !str.equals("gift") ? "bg096" : "bg100";
                    default:
                        return "bg096";
                }
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                if (str == null) {
                    return "bg129";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg129" : "bg127";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg129" : "bg131";
                    case -510663909:
                        return !str.equals("holidays") ? "bg129" : "bg130";
                    case -290756696:
                        str.equals("education");
                        return "bg129";
                    case 3172656:
                        return !str.equals("gift") ? "bg129" : "bg128";
                    default:
                        return "bg129";
                }
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                if (str == null) {
                    return "bg148";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg148" : "bg146";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg148" : "bg150";
                    case -510663909:
                        return !str.equals("holidays") ? "bg148" : "bg149";
                    case -290756696:
                        str.equals("education");
                        return "bg148";
                    case 3172656:
                        return !str.equals("gift") ? "bg148" : "bg147";
                    default:
                        return "bg148";
                }
            }
            if (theme instanceof AbstractThemeDeclaration) {
                if (str == null) {
                    return "bg089";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg089" : "bg114";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg089" : "bg087";
                    case -510663909:
                        return !str.equals("holidays") ? "bg089" : "bg086";
                    case -290756696:
                        return !str.equals("education") ? "bg089" : "bg111";
                    case 3172656:
                        return !str.equals("gift") ? "bg089" : "bg112";
                    default:
                        return "bg089";
                }
            }
            if (theme instanceof GlowThemeDeclaration) {
                if (str == null) {
                    return "bg190";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg190" : "bg194";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg190" : "bg193";
                    case -510663909:
                        return !str.equals("holidays") ? "bg190" : "bg192";
                    case -290756696:
                        return !str.equals("education") ? "bg190" : "bg196";
                    case 3172656:
                        return !str.equals("gift") ? "bg190" : "bg195";
                    default:
                        return "bg190";
                }
            }
            if (theme instanceof LinesThemeDeclaration) {
                if (str == null) {
                    return "bg164";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg164" : "bg171";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg164" : "bg168";
                    case -510663909:
                        return !str.equals("holidays") ? "bg164" : "bg167";
                    case -290756696:
                        return !str.equals("education") ? "bg164" : "bg159";
                    case 3172656:
                        return !str.equals("gift") ? "bg164" : "bg175";
                    default:
                        return "bg164";
                }
            }
            if (theme instanceof GlassThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg006";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg049";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg047";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg026";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg014";
                            }
                            break;
                    }
                }
                return "bg039";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                if (str == null) {
                    return "bg070";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg070" : "bg074";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg070" : "bg068";
                    case -510663909:
                        return !str.equals("holidays") ? "bg070" : "bg069";
                    case -290756696:
                        return !str.equals("education") ? "bg070" : "bg085";
                    case 3172656:
                        return !str.equals("gift") ? "bg070" : "bg073";
                    default:
                        return "bg070";
                }
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg006";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg049";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg047";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg026";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg014";
                            }
                            break;
                    }
                }
                return "bg039";
            }
            if (theme instanceof PrideThemeDeclaration) {
                if (str == null) {
                    return "bg213";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg213" : "bg218";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg213" : "bg215";
                    case -510663909:
                        return !str.equals("holidays") ? "bg213" : "bg217";
                    case -290756696:
                        return !str.equals("education") ? "bg213" : "bg225";
                    case 3172656:
                        return !str.equals("gift") ? "bg213" : "bg216";
                    default:
                        return "bg213";
                }
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                if (str == null) {
                    return "bg240";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg240" : "bg242";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg240" : "bg239";
                    case -510663909:
                        return !str.equals("holidays") ? "bg240" : "bg241";
                    case -290756696:
                        return !str.equals("education") ? "bg240" : "bg244";
                    case 3172656:
                        return !str.equals("gift") ? "bg240" : "bg243";
                    default:
                        return "bg240";
                }
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                if (str == null) {
                    return "bg262";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg262" : "bg259";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg262" : "bg266";
                    case -510663909:
                        return !str.equals("holidays") ? "bg262" : "bg264";
                    case -290756696:
                        return !str.equals("education") ? "bg262" : "bg265";
                    case 3172656:
                        return !str.equals("gift") ? "bg262" : "bg263";
                    default:
                        return "bg262";
                }
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg559";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                if (str == null) {
                    return "bg271";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg271" : "bg274";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg271" : "bg273";
                    case -510663909:
                        return !str.equals("holidays") ? "bg271" : "bg272";
                    case -290756696:
                        return !str.equals("education") ? "bg271" : "bg276";
                    case 3172656:
                        return !str.equals("gift") ? "bg271" : "bg275";
                    default:
                        return "bg271";
                }
            }
            if (theme instanceof LightsThemeDeclaration) {
                if (str == null) {
                    return "bg248";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg248" : "bg251";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg248" : "bg250";
                    case -510663909:
                        return !str.equals("holidays") ? "bg248" : "bg249";
                    case -290756696:
                        return !str.equals("education") ? "bg248" : "bg253";
                    case 3172656:
                        return !str.equals("gift") ? "bg248" : "bg252";
                    default:
                        return "bg248";
                }
            }
            if (theme instanceof ApexThemeDeclaration) {
                if (str == null) {
                    return "bg350";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg350" : "bg309";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg350" : "bg308";
                    case -510663909:
                        return !str.equals("holidays") ? "bg350" : "bg307";
                    case -290756696:
                        return !str.equals("education") ? "bg350" : "bg311";
                    case 3172656:
                        return !str.equals("gift") ? "bg350" : "bg310";
                    default:
                        return "bg350";
                }
            }
            if (theme instanceof CryptoThemeDeclaration) {
                if (str == null) {
                    return "bg338";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg338" : "bg342";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg338" : "bg341";
                    case -510663909:
                        return !str.equals("holidays") ? "bg338" : "bg340";
                    case -290756696:
                        return !str.equals("education") ? "bg338" : "bg344";
                    case 3172656:
                        return !str.equals("gift") ? "bg338" : "bg343";
                    default:
                        return "bg338";
                }
            }
            if (theme instanceof ExploreThemeDeclaration) {
                if (str == null) {
                    return "bg316";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg316" : "bg320";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg316" : "bg319";
                    case -510663909:
                        return !str.equals("holidays") ? "bg316" : "bg318";
                    case -290756696:
                        return !str.equals("education") ? "bg316" : "bg322";
                    case 3172656:
                        return !str.equals("gift") ? "bg316" : "bg321";
                    default:
                        return "bg316";
                }
            }
            if (theme instanceof HorizonThemeDeclaration) {
                if (str == null) {
                    return "bg327";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg327" : "bg331";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg327" : "bg330";
                    case -510663909:
                        return !str.equals("holidays") ? "bg327" : "bg329";
                    case -290756696:
                        return !str.equals("education") ? "bg327" : "bg333";
                    case 3172656:
                        return !str.equals("gift") ? "bg327" : "bg332";
                    default:
                        return "bg327";
                }
            }
            if (theme instanceof LavaThemeDeclaration) {
                if (str == null) {
                    return "bg352";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg352" : "bg355";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg352" : "bg354";
                    case -510663909:
                        return !str.equals("holidays") ? "bg352" : "bg353";
                    case -290756696:
                        return !str.equals("education") ? "bg352" : "bg358";
                    case 3172656:
                        return !str.equals("gift") ? "bg352" : "bg357";
                    default:
                        return "bg352";
                }
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                if (str == null) {
                    return "bg363";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg363" : "bg368";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg363" : "bg367";
                    case -510663909:
                        return !str.equals("holidays") ? "bg363" : "bg366";
                    case -290756696:
                        return !str.equals("education") ? "bg363" : "bg370";
                    case 3172656:
                        return !str.equals("gift") ? "bg363" : "bg369";
                    default:
                        return "bg363";
                }
            }
            if (theme instanceof GeometricDeclaration) {
                if (str == null) {
                    return "bg374";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg374" : "bg379";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg374" : "bg378";
                    case -510663909:
                        return !str.equals("holidays") ? "bg374" : "bg377";
                    case -290756696:
                        return !str.equals("education") ? "bg374" : "bg381";
                    case 3172656:
                        return !str.equals("gift") ? "bg374" : "bg380";
                    default:
                        return "bg374";
                }
            }
            if (theme instanceof DogsDeclaration) {
                if (str == null) {
                    return "bg385";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg385" : "bg389";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg385" : "bg388";
                    case -510663909:
                        return !str.equals("holidays") ? "bg385" : "bg387";
                    case -290756696:
                        return !str.equals("education") ? "bg385" : "bg391";
                    case 3172656:
                        return !str.equals("gift") ? "bg385" : "bg390";
                    default:
                        return "bg385";
                }
            }
            if (theme instanceof PsychedelicDeclaration) {
                if (str == null) {
                    return "bg396";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg396" : "bg401";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg396" : "bg400";
                    case -510663909:
                        return !str.equals("holidays") ? "bg396" : "bg399";
                    case -290756696:
                        return !str.equals("education") ? "bg396" : "bg403";
                    case 3172656:
                        return !str.equals("gift") ? "bg396" : "bg402";
                    default:
                        return "bg396";
                }
            }
            if (theme instanceof VelvetDeclaration) {
                if (str == null) {
                    return "bg415";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        str.equals("renovation");
                        return "bg415";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg415" : "bg421";
                    case -510663909:
                        return !str.equals("holidays") ? "bg415" : "bg416";
                    case -290756696:
                        return !str.equals("education") ? "bg415" : "bg413";
                    case 3172656:
                        return !str.equals("gift") ? "bg415" : "bg417";
                    default:
                        return "bg415";
                }
            }
            if (theme instanceof FlowersDeclaration) {
                if (str == null) {
                    return "bg424";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg424" : "bg426";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg424" : "bg432";
                    case -510663909:
                        return !str.equals("holidays") ? "bg424" : "bg427";
                    case -290756696:
                        return !str.equals("education") ? "bg424" : "bg423";
                    case 3172656:
                        return !str.equals("gift") ? "bg424" : "bg428";
                    default:
                        return "bg424";
                }
            }
            if (theme instanceof TravertineDeclaration) {
                if (str == null) {
                    return "bg281";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg281" : "bg283";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg281" : "bg285";
                    case -510663909:
                        return !str.equals("holidays") ? "bg281" : "bg291";
                    case -290756696:
                        return !str.equals("education") ? "bg281" : "bg286";
                    case 3172656:
                        return !str.equals("gift") ? "bg281" : "bg284";
                    default:
                        return "bg281";
                }
            }
            if (theme instanceof PremiumThemeDeclaration) {
                if (str == null) {
                    return "bg433";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg433" : "bg438";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg433" : "bg437";
                    case -510663909:
                        return !str.equals("holidays") ? "bg433" : "bg436";
                    case -290756696:
                        return !str.equals("education") ? "bg433" : "bg440";
                    case 3172656:
                        return !str.equals("gift") ? "bg433" : "bg439";
                    default:
                        return "bg433";
                }
            }
            if (theme instanceof UltraThemeDeclaration) {
                if (str == null) {
                    return "bg444";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg444" : "bg449";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg444" : "bg448";
                    case -510663909:
                        return !str.equals("holidays") ? "bg444" : "bg447";
                    case -290756696:
                        return !str.equals("education") ? "bg444" : "bg451";
                    case 3172656:
                        return !str.equals("gift") ? "bg444" : "bg450";
                    default:
                        return "bg444";
                }
            }
            if (!(theme instanceof MetalThemeDeclaration)) {
                if (theme instanceof JuniorGlowThemeDeclaration) {
                    return "bg467";
                }
                if (theme instanceof PrivateThemeDeclaration) {
                    return "bg466";
                }
                throw new NoWhenBranchMatchedException();
            }
            if (str == null) {
                return "bg455";
            }
            switch (str.hashCode()) {
                case -1456326541:
                    return !str.equals("renovation") ? "bg455" : "bg460";
                case -675786404:
                    return !str.equals("rainyDays") ? "bg455" : "bg459";
                case -510663909:
                    return !str.equals("holidays") ? "bg455" : "bg458";
                case -290756696:
                    return !str.equals("education") ? "bg455" : "bg462";
                case 3172656:
                    return !str.equals("gift") ? "bg455" : "bg461";
                default:
                    return "bg455";
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63864c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubAccountGroup)) {
                return false;
            }
            SubAccountGroup subAccountGroup = (SubAccountGroup) obj2;
            return Intrinsics.f(this.f63862a, subAccountGroup.f63862a) && Intrinsics.f(this.f63863b, subAccountGroup.f63863b) && Intrinsics.f(this.f63864c, subAccountGroup.f63864c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final xi0.b getF63879b() {
            return this.f63863b;
        }

        public final int hashCode() {
            String str = this.f63862a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            xi0.b bVar = this.f63863b;
            return this.f63864c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63862a);
            dest.writeSerializable(this.f63863b);
            this.f63864c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountPersonal;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubAccountPersonal extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f63866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63867c;

        @NotNull
        public static final Parcelable.Creator<SubAccountPersonal> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubAccountPersonal(parcel.readString(), (xi0.b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubAccountPersonal[i];
            }
        }

        public SubAccountPersonal(String str, xi0.b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63865a = str;
            this.f63866b = bVar;
            this.f63867c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return a.q("VaultPersonal_id_", this.f63865a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            boolean z = theme instanceof UKLandscapesDeclaration;
            String str = this.f63865a;
            if (z) {
                if (str == null) {
                    return "bg522";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg522" : "bg528";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg522" : "bg526";
                    case -510663909:
                        return !str.equals("holidays") ? "bg522" : "bg525";
                    case -290756696:
                        return !str.equals("education") ? "bg522" : "bg530";
                    case 3172656:
                        return !str.equals("gift") ? "bg522" : "bg529";
                    default:
                        return "bg522";
                }
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                if (str == null) {
                    return "bg104";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg104" : "bg102";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg104" : "bg093";
                    case -510663909:
                        return !str.equals("holidays") ? "bg104" : "bg098";
                    case -290756696:
                        return !str.equals("education") ? "bg104" : "bg094";
                    case 3172656:
                        return !str.equals("gift") ? "bg104" : "bg100";
                    default:
                        return "bg104";
                }
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                if (str == null) {
                    return "bg128";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg128" : "bg127";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg128" : "bg131";
                    case -510663909:
                        return !str.equals("holidays") ? "bg128" : "bg130";
                    case -290756696:
                        return !str.equals("education") ? "bg128" : "bg129";
                    case 3172656:
                        str.equals("gift");
                        return "bg128";
                    default:
                        return "bg128";
                }
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                if (str == null) {
                    return "bg147";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg147" : "bg146";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg147" : "bg150";
                    case -510663909:
                        return !str.equals("holidays") ? "bg147" : "bg149";
                    case -290756696:
                        return !str.equals("education") ? "bg147" : "bg148";
                    case 3172656:
                        str.equals("gift");
                        return "bg147";
                    default:
                        return "bg147";
                }
            }
            if (theme instanceof AbstractThemeDeclaration) {
                if (str == null) {
                    return "bg113";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg113" : "bg114";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg113" : "bg087";
                    case -510663909:
                        return !str.equals("holidays") ? "bg113" : "bg086";
                    case -290756696:
                        return !str.equals("education") ? "bg113" : "bg111";
                    case 3172656:
                        return !str.equals("gift") ? "bg113" : "bg112";
                    default:
                        return "bg113";
                }
            }
            if (theme instanceof GlowThemeDeclaration) {
                if (str == null) {
                    return "bg190";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg190" : "bg194";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg190" : "bg193";
                    case -510663909:
                        return !str.equals("holidays") ? "bg190" : "bg192";
                    case -290756696:
                        return !str.equals("education") ? "bg190" : "bg196";
                    case 3172656:
                        return !str.equals("gift") ? "bg190" : "bg195";
                    default:
                        return "bg190";
                }
            }
            if (theme instanceof LinesThemeDeclaration) {
                if (str == null) {
                    return "bg161";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg161" : "bg171";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg161" : "bg168";
                    case -510663909:
                        return !str.equals("holidays") ? "bg161" : "bg167";
                    case -290756696:
                        return !str.equals("education") ? "bg161" : "bg159";
                    case 3172656:
                        return !str.equals("gift") ? "bg161" : "bg175";
                    default:
                        return "bg161";
                }
            }
            if (theme instanceof GlassThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg006";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg049";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg047";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg026";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg014";
                            }
                            break;
                    }
                }
                return "bg043";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                if (str == null) {
                    return "bg067";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg067" : "bg074";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg067" : "bg068";
                    case -510663909:
                        return !str.equals("holidays") ? "bg067" : "bg069";
                    case -290756696:
                        return !str.equals("education") ? "bg067" : "bg085";
                    case 3172656:
                        return !str.equals("gift") ? "bg067" : "bg073";
                    default:
                        return "bg067";
                }
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg006";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg049";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg047";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg026";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg014";
                            }
                            break;
                    }
                }
                return "bg043";
            }
            if (theme instanceof PrideThemeDeclaration) {
                if (str == null) {
                    return "bg211";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg211" : "bg218";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg211" : "bg215";
                    case -510663909:
                        return !str.equals("holidays") ? "bg211" : "bg217";
                    case -290756696:
                        return !str.equals("education") ? "bg211" : "bg225";
                    case 3172656:
                        return !str.equals("gift") ? "bg211" : "bg216";
                    default:
                        return "bg211";
                }
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                if (str == null) {
                    return "bg237";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg237" : "bg242";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg237" : "bg239";
                    case -510663909:
                        return !str.equals("holidays") ? "bg237" : "bg241";
                    case -290756696:
                        return !str.equals("education") ? "bg237" : "bg244";
                    case 3172656:
                        return !str.equals("gift") ? "bg237" : "bg243";
                    default:
                        return "bg237";
                }
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                if (str == null) {
                    return "bg269";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg269" : "bg259";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg269" : "bg266";
                    case -510663909:
                        return !str.equals("holidays") ? "bg269" : "bg264";
                    case -290756696:
                        return !str.equals("education") ? "bg269" : "bg265";
                    case 3172656:
                        return !str.equals("gift") ? "bg269" : "bg263";
                    default:
                        return "bg269";
                }
            }
            if (theme instanceof SnakeThemeDeclaration) {
                if (str == null) {
                    return "bg270";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg270" : "bg274";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg270" : "bg273";
                    case -510663909:
                        return !str.equals("holidays") ? "bg270" : "bg272";
                    case -290756696:
                        return !str.equals("education") ? "bg270" : "bg276";
                    case 3172656:
                        return !str.equals("gift") ? "bg270" : "bg275";
                    default:
                        return "bg270";
                }
            }
            if (theme instanceof LightsThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg251";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg250";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg249";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg253";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg252";
                            }
                            break;
                    }
                }
                return "bg247";
            }
            if (theme instanceof ApexThemeDeclaration) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1456326541:
                            if (str.equals("renovation")) {
                                return "bg309";
                            }
                            break;
                        case -675786404:
                            if (str.equals("rainyDays")) {
                                return "bg308";
                            }
                            break;
                        case -510663909:
                            if (str.equals("holidays")) {
                                return "bg307";
                            }
                            break;
                        case -290756696:
                            if (str.equals("education")) {
                                return "bg311";
                            }
                            break;
                        case 3172656:
                            if (str.equals("gift")) {
                                return "bg310";
                            }
                            break;
                    }
                }
                return "bg247";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                if (str == null) {
                    return "bg338";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg338" : "bg342";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg338" : "bg341";
                    case -510663909:
                        return !str.equals("holidays") ? "bg338" : "bg340";
                    case -290756696:
                        return !str.equals("education") ? "bg338" : "bg344";
                    case 3172656:
                        return !str.equals("gift") ? "bg338" : "bg343";
                    default:
                        return "bg338";
                }
            }
            if (theme instanceof ExploreThemeDeclaration) {
                if (str == null) {
                    return "bg316";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg316" : "bg320";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg316" : "bg319";
                    case -510663909:
                        return !str.equals("holidays") ? "bg316" : "bg318";
                    case -290756696:
                        return !str.equals("education") ? "bg316" : "bg322";
                    case 3172656:
                        return !str.equals("gift") ? "bg316" : "bg321";
                    default:
                        return "bg316";
                }
            }
            if (theme instanceof HorizonThemeDeclaration) {
                if (str == null) {
                    return "bg327";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg327" : "bg331";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg327" : "bg330";
                    case -510663909:
                        return !str.equals("holidays") ? "bg327" : "bg329";
                    case -290756696:
                        return !str.equals("education") ? "bg327" : "bg333";
                    case 3172656:
                        return !str.equals("gift") ? "bg327" : "bg332";
                    default:
                        return "bg327";
                }
            }
            if (theme instanceof LavaThemeDeclaration) {
                if (str == null) {
                    return "bg352";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg352" : "bg355";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg352" : "bg354";
                    case -510663909:
                        return !str.equals("holidays") ? "bg352" : "bg353";
                    case -290756696:
                        return !str.equals("education") ? "bg352" : "bg358";
                    case 3172656:
                        return !str.equals("gift") ? "bg352" : "bg357";
                    default:
                        return "bg352";
                }
            }
            if (theme instanceof AlexKDeclaration) {
                if (str == null) {
                    return "bg363";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg363" : "bg368";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg363" : "bg367";
                    case -510663909:
                        return !str.equals("holidays") ? "bg363" : "bg366";
                    case -290756696:
                        return !str.equals("education") ? "bg363" : "bg370";
                    case 3172656:
                        return !str.equals("gift") ? "bg363" : "bg369";
                    default:
                        return "bg363";
                }
            }
            if (theme instanceof GeometricDeclaration) {
                if (str == null) {
                    return "bg374";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg374" : "bg379";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg374" : "bg378";
                    case -510663909:
                        return !str.equals("holidays") ? "bg374" : "bg377";
                    case -290756696:
                        return !str.equals("education") ? "bg374" : "bg381";
                    case 3172656:
                        return !str.equals("gift") ? "bg374" : "bg380";
                    default:
                        return "bg374";
                }
            }
            if (theme instanceof DogsDeclaration) {
                if (str == null) {
                    return "bg385";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg385" : "bg389";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg385" : "bg388";
                    case -510663909:
                        return !str.equals("holidays") ? "bg385" : "bg387";
                    case -290756696:
                        return !str.equals("education") ? "bg385" : "bg391";
                    case 3172656:
                        return !str.equals("gift") ? "bg385" : "bg390";
                    default:
                        return "bg385";
                }
            }
            if (theme instanceof PsychedelicDeclaration) {
                if (str == null) {
                    return "bg396";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg396" : "bg401";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg396" : "bg400";
                    case -510663909:
                        return !str.equals("holidays") ? "bg396" : "bg399";
                    case -290756696:
                        return !str.equals("education") ? "bg396" : "bg403";
                    case 3172656:
                        return !str.equals("gift") ? "bg396" : "bg402";
                    default:
                        return "bg396";
                }
            }
            if (theme instanceof VelvetDeclaration) {
                if (str == null) {
                    return "bg412";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg412" : "bg415";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg412" : "bg421";
                    case -510663909:
                        return !str.equals("holidays") ? "bg412" : "bg416";
                    case -290756696:
                        return !str.equals("education") ? "bg412" : "bg413";
                    case 3172656:
                        return !str.equals("gift") ? "bg412" : "bg417";
                    default:
                        return "bg412";
                }
            }
            if (theme instanceof FlowersDeclaration) {
                if (str == null) {
                    return "bg424";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg424" : "bg426";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg424" : "bg432";
                    case -510663909:
                        return !str.equals("holidays") ? "bg424" : "bg427";
                    case -290756696:
                        return !str.equals("education") ? "bg424" : "bg423";
                    case 3172656:
                        return !str.equals("gift") ? "bg424" : "bg428";
                    default:
                        return "bg424";
                }
            }
            if (theme instanceof TravertineDeclaration) {
                if (str == null) {
                    return "bg281";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg281" : "bg283";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg281" : "bg285";
                    case -510663909:
                        return !str.equals("holidays") ? "bg281" : "bg291";
                    case -290756696:
                        return !str.equals("education") ? "bg281" : "bg286";
                    case 3172656:
                        return !str.equals("gift") ? "bg281" : "bg284";
                    default:
                        return "bg281";
                }
            }
            if (theme instanceof PremiumThemeDeclaration) {
                if (str == null) {
                    return "bg433";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg433" : "bg438";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg433" : "bg437";
                    case -510663909:
                        return !str.equals("holidays") ? "bg433" : "bg436";
                    case -290756696:
                        return !str.equals("education") ? "bg433" : "bg440";
                    case 3172656:
                        return !str.equals("gift") ? "bg433" : "bg439";
                    default:
                        return "bg433";
                }
            }
            if (theme instanceof UltraThemeDeclaration) {
                if (str == null) {
                    return "bg444";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg444" : "bg449";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg444" : "bg448";
                    case -510663909:
                        return !str.equals("holidays") ? "bg444" : "bg447";
                    case -290756696:
                        return !str.equals("education") ? "bg444" : "bg451";
                    case 3172656:
                        return !str.equals("gift") ? "bg444" : "bg450";
                    default:
                        return "bg444";
                }
            }
            if (theme instanceof MetalThemeDeclaration) {
                if (str == null) {
                    return "bg455";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg455" : "bg460";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg455" : "bg459";
                    case -510663909:
                        return !str.equals("holidays") ? "bg455" : "bg458";
                    case -290756696:
                        return !str.equals("education") ? "bg455" : "bg462";
                    case 3172656:
                        return !str.equals("gift") ? "bg455" : "bg461";
                    default:
                        return "bg455";
                }
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                if (str == null) {
                    return "bg552";
                }
                switch (str.hashCode()) {
                    case -1456326541:
                        return !str.equals("renovation") ? "bg552" : "bg557";
                    case -675786404:
                        return !str.equals("rainyDays") ? "bg552" : "bg562";
                    case -510663909:
                        return !str.equals("holidays") ? "bg552" : "bg560";
                    case -290756696:
                        return !str.equals("education") ? "bg552" : "bg558";
                    case 3172656:
                        return !str.equals("gift") ? "bg552" : "bg555";
                    default:
                        return "bg552";
                }
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63867c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubAccountPersonal)) {
                return false;
            }
            SubAccountPersonal subAccountPersonal = (SubAccountPersonal) obj2;
            return Intrinsics.f(this.f63865a, subAccountPersonal.f63865a) && Intrinsics.f(this.f63866b, subAccountPersonal.f63866b) && Intrinsics.f(this.f63867c, subAccountPersonal.f63867c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final xi0.b getF63879b() {
            return this.f63866b;
        }

        public final int hashCode() {
            String str = this.f63865a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            xi0.b bVar = this.f63866b;
            return this.f63867c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63865a);
            dest.writeSerializable(this.f63866b);
            this.f63867c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountPlanCashback;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubAccountPlanCashback extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<SubAccountPlanCashback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63870c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubAccountPlanCashback(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubAccountPlanCashback[i];
            }
        }

        public SubAccountPlanCashback(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63868a = str;
            this.f63869b = bVar;
            this.f63870c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("PlanCashback_id_", this.f63868a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg524";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg097";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg127";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg146";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg083";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg190";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg167";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg012";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg064";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg083";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg556";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg228";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg236";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg266";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg279";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg256";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg314";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg348";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg325";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg336";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg361";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg373";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg384";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg394";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg406";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg420";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg431";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg289";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg443";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg454";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg464";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63870c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubAccountPlanCashback)) {
                return false;
            }
            SubAccountPlanCashback subAccountPlanCashback = (SubAccountPlanCashback) obj2;
            return Intrinsics.f(this.f63868a, subAccountPlanCashback.f63868a) && Intrinsics.f(this.f63869b, subAccountPlanCashback.f63869b) && Intrinsics.f(this.f63870c, subAccountPlanCashback.f63870c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63869b;
        }

        public final int hashCode() {
            String str = this.f63868a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63869b;
            return this.f63870c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63868a);
            dest.writeSerializable(this.f63869b);
            this.f63870c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$SubAccountRevPointsPocket;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubAccountRevPointsPocket extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<SubAccountRevPointsPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63873c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubAccountRevPointsPocket(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubAccountRevPointsPocket[i];
            }
        }

        public SubAccountRevPointsPocket(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63871a = str;
            this.f63872b = bVar;
            this.f63873c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("PointsPocket_id_", this.f63871a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg530";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg104";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg128";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg147";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg113";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg200";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg161";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg043";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg067";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg043";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg210";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg246";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg268";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg280";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg257";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg314";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg347";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg325";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg336";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg362";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg372";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg383";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg394";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg405";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg419";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg430";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg290";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg443";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg454";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg465";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63873c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubAccountRevPointsPocket)) {
                return false;
            }
            SubAccountRevPointsPocket subAccountRevPointsPocket = (SubAccountRevPointsPocket) obj2;
            return Intrinsics.f(this.f63871a, subAccountRevPointsPocket.f63871a) && Intrinsics.f(this.f63872b, subAccountRevPointsPocket.f63872b) && Intrinsics.f(this.f63873c, subAccountRevPointsPocket.f63873c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63872b;
        }

        public final int hashCode() {
            String str = this.f63871a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63872b;
            return this.f63873c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63871a);
            dest.writeSerializable(this.f63872b);
            this.f63873c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$TotalWealthHome;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "<init>", "()V", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalWealthHome extends RetailBackgroundKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TotalWealthHome f63874a = new TotalWealthHome();

        @NotNull
        public static final Parcelable.Creator<TotalWealthHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalWealthHome.f63874a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealthHome[i];
            }
        }

        private TotalWealthHome() {
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return "TotalWealth";
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg521";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg092";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg116";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg139";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg016";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg190";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg156";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg003";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg084";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg001";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg212";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg236";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg258";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg270";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg247";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg350";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg338";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg316";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg327";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg352";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg363";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg374";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg385";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg396";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg412";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg424";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg281";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg433";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg444";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg455";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e */
        public final EntityInfo getF63880c() {
            return new EntityInfo(e.CURRENCY, f.AGGREGATED, d.OPENED);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency */
        public final b getF63879b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$Youth;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Youth extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<Youth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63877c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Youth(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Youth[i];
            }
        }

        public Youth(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63875a = str;
            this.f63876b = bVar;
            this.f63877c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("Youth_id_", this.f63875a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg526";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg100";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg121";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg144";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg046";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg195";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg157";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg017";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg085";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg090";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg232";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg242";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg264";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg276";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg252";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg310";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg343";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg321";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg332";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg358";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg368";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg379";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg390";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg401";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg413";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg423";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg286";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg438";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg449";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg460";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63877c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Youth)) {
                return false;
            }
            Youth youth = (Youth) obj2;
            return Intrinsics.f(this.f63875a, youth.f63875a) && Intrinsics.f(this.f63876b, youth.f63876b) && Intrinsics.f(this.f63877c, youth.f63877c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63876b;
        }

        public final int hashCode() {
            String str = this.f63875a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63876b;
            return this.f63877c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63875a);
            dest.writeSerializable(this.f63876b);
            this.f63877c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey$YouthSavings;", "Lcom/revolut/feature/backgroundpicker/models/RetailBackgroundKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_background_picker_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YouthSavings extends RetailBackgroundKey {

        @NotNull
        public static final Parcelable.Creator<YouthSavings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f63879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EntityInfo f63880c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YouthSavings(parcel.readString(), (b) parcel.readSerializable(), EntityInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YouthSavings[i];
            }
        }

        public YouthSavings(String str, b bVar, EntityInfo entityInfo) {
            Intrinsics.checkNotNullParameter(entityInfo, "entityInfo");
            this.f63878a = str;
            this.f63879b = bVar;
            this.f63880c = entityInfo;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        /* JADX INFO: renamed from: a */
        public final String getF63853a() {
            throw null;
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
        public final String b() {
            return j6.a.q("YouthSaving_id_", this.f63878a);
        }

        @Override // com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey
        public final String d(GlobalThemeDeclaration theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            if (theme instanceof UKLandscapesDeclaration) {
                return "bg526";
            }
            if (theme instanceof CyberpunkThemeDeclaration) {
                return "bg100";
            }
            if (theme instanceof HalloweenThemeDeclaration) {
                return "bg121";
            }
            if (theme instanceof ChristmasThemeDeclaration) {
                return "bg144";
            }
            if (theme instanceof AbstractThemeDeclaration) {
                return "bg111";
            }
            if (theme instanceof GlowThemeDeclaration) {
                return "bg195";
            }
            if (theme instanceof LinesThemeDeclaration) {
                return "bg157";
            }
            if (theme instanceof GlassThemeDeclaration) {
                return "bg017";
            }
            if (theme instanceof ColoursThemeDeclaration) {
                return "bg085";
            }
            if (theme instanceof LegacyDefaultThemeDeclaration) {
                return "bg090";
            }
            if (theme instanceof MinimalThemeDeclaration) {
                return "empty";
            }
            if (theme instanceof ParticlesThemeDeclaration) {
                return "bg552";
            }
            if (theme instanceof BusinessThemeDeclaration) {
                return "bg301";
            }
            if (theme instanceof RevolutXThemeDeclaration) {
                return "bg306";
            }
            if (theme instanceof PrideThemeDeclaration) {
                return "bg232";
            }
            if (theme instanceof Cyberpunk2ThemeDeclaration) {
                return "bg242";
            }
            if (theme instanceof ZodiacThemeDeclaration) {
                return "bg264";
            }
            if (theme instanceof SnakeThemeDeclaration) {
                return "bg276";
            }
            if (theme instanceof LightsThemeDeclaration) {
                return "bg252";
            }
            if (theme instanceof ApexThemeDeclaration) {
                return "bg310";
            }
            if (theme instanceof CryptoThemeDeclaration) {
                return "bg343";
            }
            if (theme instanceof ExploreThemeDeclaration) {
                return "bg321";
            }
            if (theme instanceof HorizonThemeDeclaration) {
                return "bg332";
            }
            if (theme instanceof LavaThemeDeclaration) {
                return "bg358";
            }
            if (theme instanceof UpbeatThemeDeclaration) {
                return "bg177";
            }
            if (theme instanceof AlexKDeclaration) {
                return "bg368";
            }
            if (theme instanceof GeometricDeclaration) {
                return "bg379";
            }
            if (theme instanceof DogsDeclaration) {
                return "bg390";
            }
            if (theme instanceof PsychedelicDeclaration) {
                return "bg401";
            }
            if (theme instanceof VelvetDeclaration) {
                return "bg413";
            }
            if (theme instanceof FlowersDeclaration) {
                return "bg423";
            }
            if (theme instanceof JuniorGlowThemeDeclaration) {
                return "bg467";
            }
            if (theme instanceof TravertineDeclaration) {
                return "bg286";
            }
            if (theme instanceof PremiumThemeDeclaration) {
                return "bg438";
            }
            if (theme instanceof UltraThemeDeclaration) {
                return "bg449";
            }
            if (theme instanceof MetalThemeDeclaration) {
                return "bg460";
            }
            if (theme instanceof PrivateThemeDeclaration) {
                return "bg466";
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: e, reason: from getter */
        public final EntityInfo getF63880c() {
            return this.f63880c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof YouthSavings)) {
                return false;
            }
            YouthSavings youthSavings = (YouthSavings) obj2;
            return Intrinsics.f(this.f63878a, youthSavings.f63878a) && Intrinsics.f(this.f63879b, youthSavings.f63879b) && Intrinsics.f(this.f63880c, youthSavings.f63880c);
        }

        @Override // com.revolut.feature.backgroundpicker.models.RetailBackgroundKey
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF63879b() {
            return this.f63879b;
        }

        public final int hashCode() {
            String str = this.f63878a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f63879b;
            return this.f63880c.hashCode() + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63878a);
            dest.writeSerializable(this.f63879b);
            this.f63880c.writeToParcel(dest, i);
        }
    }

    private RetailBackgroundKey() {
    }

    @Override // com.revolut.feature.backgroundpicker.api.model.BackgroundKey
    public k c() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract EntityInfo getF63880c();

    /* JADX INFO: renamed from: getCurrency */
    public abstract b getF63879b();
}
