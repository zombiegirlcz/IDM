package com.github.devnied.emvnfccard.model;

import com.github.devnied.emvnfccard.enums.EmvCardScheme;
import com.github.devnied.emvnfccard.model.enums.CardStateEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class EmvCard extends AbstractData {
    private static final long serialVersionUID = 736740432469989941L;

    /* JADX INFO: renamed from: at, reason: collision with root package name */
    private String f37248at;
    private Collection<String> atrDescription;

    /* JADX INFO: renamed from: bic, reason: collision with root package name */
    private String f37249bic;
    private CPLC cplc;
    private String holderFirstname;
    private String holderLastname;
    private String iban;
    private EmvTrack1 track1;
    private EmvTrack2 track2;
    private EmvCardScheme type;
    private final List<Application> applications = new ArrayList();
    private CardStateEnum state = CardStateEnum.UNKNOWN;

    public boolean equals(Object obj2) {
        return (obj2 instanceof EmvCard) && getCardNumber() != null && getCardNumber().equals(((EmvCard) obj2).getCardNumber());
    }

    public List<Application> getApplications() {
        return this.applications;
    }

    public String getAt() {
        return this.f37248at;
    }

    public Collection<String> getAtrDescription() {
        return this.atrDescription;
    }

    public String getBic() {
        return this.f37249bic;
    }

    public String getCardNumber() {
        EmvTrack1 emvTrack1;
        EmvTrack2 emvTrack2 = this.track2;
        String cardNumber = emvTrack2 != null ? emvTrack2.getCardNumber() : null;
        return (cardNumber != null || (emvTrack1 = this.track1) == null) ? cardNumber : emvTrack1.getCardNumber();
    }

    public CPLC getCplc() {
        return this.cplc;
    }

    public Date getExpireDate() {
        EmvTrack1 emvTrack1;
        EmvTrack2 emvTrack2 = this.track2;
        Date expireDate = emvTrack2 != null ? emvTrack2.getExpireDate() : null;
        return (expireDate != null || (emvTrack1 = this.track1) == null) ? expireDate : emvTrack1.getExpireDate();
    }

    public String getHolderFirstname() {
        EmvTrack1 emvTrack1;
        String str = this.holderFirstname;
        return (str != null || (emvTrack1 = this.track1) == null) ? str : emvTrack1.getHolderFirstname();
    }

    public String getHolderLastname() {
        EmvTrack1 emvTrack1;
        String str = this.holderLastname;
        return (str != null || (emvTrack1 = this.track1) == null) ? str : emvTrack1.getHolderLastname();
    }

    public String getIban() {
        return this.iban;
    }

    public CardStateEnum getState() {
        return this.state;
    }

    public EmvTrack1 getTrack1() {
        return this.track1;
    }

    public EmvTrack2 getTrack2() {
        return this.track2;
    }

    public EmvCardScheme getType() {
        return this.type;
    }

    public void setAt(String str) {
        this.f37248at = str;
    }

    public void setAtrDescription(Collection<String> collection) {
        this.atrDescription = collection;
    }

    public void setBic(String str) {
        this.f37249bic = str;
    }

    public void setCplc(CPLC cplc) {
        this.cplc = cplc;
    }

    public void setHolderFirstname(String str) {
        this.holderFirstname = str;
    }

    public void setHolderLastname(String str) {
        this.holderLastname = str;
    }

    public void setIban(String str) {
        this.iban = str;
    }

    public void setState(CardStateEnum cardStateEnum) {
        this.state = cardStateEnum;
    }

    public void setTrack1(EmvTrack1 emvTrack1) {
        this.track1 = emvTrack1;
    }

    public void setTrack2(EmvTrack2 emvTrack2) {
        this.track2 = emvTrack2;
    }

    public void setType(EmvCardScheme emvCardScheme) {
        this.type = emvCardScheme;
    }
}
